package dto;

import static domain.Menu.findMenuByStringValue;

import domain.Category;
import domain.MenuList;
import java.util.List;

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
