package dto;

import static domain.Menu.findMenuByStringValue;

import domain.Category;
import java.util.List;

public class MenuOrderResultResponse {

    public MenuOrderResultResponse(){

        for(Category category : Category.values()){
            if(category.isMenuListNotEmpty()){
                System.out.print(category);
            }
        }
    }
}
