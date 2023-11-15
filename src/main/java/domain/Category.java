package domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum Category {
    APPETIZER(1, "애피타이저", MenuList.APPETIZER_MENU),
    MAIN(2, "메인", MenuList.MAIN_MENU),
    DESSERT(3, "디저트", MenuList.DESSERT_MENU),
    BEVERAGE(4, "음료", MenuList.BEVERAGE_MENU),
    INVALID_CATEGORY(-1, null, "");

    private final int categoryNumber;
    private final String categoryName;
    private final List<MenuList> menuList = new ArrayList<>();

    Category(int categoryNumber, String categoryName, String menuList) {
        this.categoryNumber = categoryNumber;
        this.categoryName = categoryName;
        List<String> menus = List.of(menuList.replace(" ", "").split(","));

        for(String menuName: menus) {
            this.menuList.add(new MenuList(menuName));
        }
    }

    public static Category validateMenu(String menuName) {
        Category category = Arrays.stream(values())
                .filter(value -> value.menuList.contains(new MenuList(menuName)))
                .findAny()
                .orElse(INVALID_CATEGORY);
        return category;
    }

    public static void onlyOrderLeft(){
        for(Category category : Category.values()){
            category.removeQuantityZero();

        }

    }
    public boolean isMenuListNotEmpty(){
        return !menuList.isEmpty();
    }

    public void removeQuantityZero() {
        menuList.removeIf(MenuList::isNotOrdered);
    }

    public void setQuantity(Menu menu, int quantity){
        getmenuList().get(findMenuIndex(menu)).setQuantity(quantity);
    }

    public int findMenuIndex(Menu menu){
        return getmenuList().indexOf(new MenuList(menu));
    }


    public int getCategoryNumber() {
        return categoryNumber;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public List<MenuList> getmenuList() {return menuList; }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for(MenuList item : menuList){
            stringBuilder.append(item.toString());
        }
        return stringBuilder.toString();
    }
}
