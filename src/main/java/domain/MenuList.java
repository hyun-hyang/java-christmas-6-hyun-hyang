package domain;

import java.util.Map;

public class MenuList {
    public final static String APPETIZER_MENU = "양송이수프, 타파스, 시저샐러드";
    public final static String MAIN_MENU = "티본스테이크, 바비큐립, 해산물파스타, 크리스마스파스타";
    public final static String DESSERT_MENU = "초코케이크, 아이스크림";
    public final static String BEVERAGE_MENU = "제로콜라, 레드와인, 샴페인";

    private final int quantity;

    public final Menu menu;

    public MenuList(int quantity, Menu menu) {
        this.quantity = quantity;
        this.menu = menu;
    }
    public MenuList(String menu){
        this.menu = Menu.fromString(menu);
        this.quantity = 0;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public Menu getMenu(){
        return this.menu;
    }
}