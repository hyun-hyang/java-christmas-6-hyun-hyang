package dto;

import static domain.Menu.findMenuByStringValue;
import static view.InputView.readMenu;

import domain.Category;
import exception.ExceptionMessage;
import java.util.List;

public class MenuRequest {

    public MenuRequest(String inputString){
        List<String> parsedStrings = parsing(inputString, ",");
        for (String parsedString : parsedStrings) {
            List<String> parts = parsing(parsedString, "-");
            String menuName = parts.get(0);
            int quantity = parseToInt(parts.get(1));
            validateQuantity(quantity);
            Category category = Category.validateMenu(menuName);
            category.setQuantity(findMenuByStringValue(menuName),quantity);
        }
    }

    private int parseToInt(String inputString) {
        try{
            return Integer.parseInt(inputString);
        } catch (IllegalArgumentException e) {
            System.out.println(ExceptionMessage.DATE_INCORRECT_FORMAT);
            throw new IllegalArgumentException(ExceptionMessage.DATE_INCORRECT_FORMAT.toString());
        }
    }

    private static void validateQuantity(int quantity) {
        if(quantity < 1) {
            throw new IllegalArgumentException(ExceptionMessage.MENU_NOT_IN_RANGE.toString());
        }
    }

    private static List<String> parsing(String inputString, String parsingString) {
        try{
            return List.of(inputString.split(parsingString));
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(ExceptionMessage.MENU_INCORRECT_FORMAT.toString());
        }
    }
}
