package dto;


import domain.Category;

public class MenuOrderResultResponse {


    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        for(Category category : Category.values()){
            if(category.isMenuListNotEmpty()){
                stringBuilder.append(category);
            }
        }
        return stringBuilder.toString();
    }
}
