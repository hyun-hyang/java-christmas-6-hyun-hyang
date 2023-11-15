package view;

import static exception.ExceptionMessage.DATE_NOT_IN_RANGE;

import camp.nextstep.edu.missionutils.Console;
import domain.Category;
import exception.ExceptionMessage;
import java.util.List;

public class InputView {
    public static int readDate() {
        System.out.println("안녕하세요! 우테코 식당 12월 이벤트 플래너입니다.");
        System.out.println("12월 중 식당 예상 방문 날짜는 언제인가요? (숫자만 입력해 주세요!)");
        String inputString = Console.readLine();
        int inputInt = parseToInt(inputString);
        validateDateRange(inputInt);
        return inputInt;
    }

    private static int parseToInt(String inputString) {
        try{
            return Integer.parseInt(inputString);
        } catch (IllegalArgumentException e) {
            System.out.println(ExceptionMessage.DATE_INCORRECT_FORMAT);
            return readDate();
        }
    }

    private static void validateDateRange(int inputInt) {
        if((inputInt < 1) || (inputInt > 31)) {
            throw new IllegalArgumentException(DATE_NOT_IN_RANGE.toString());
        }
    }

    public static List<String> readMenu() {
        System.out.println("주문하실 메뉴를 메뉴와 개수를 알려 주세요. (e.g. 해산물파스타-2,레드와인-1,초코케이크-1)");
        String inputString = Console.readLine();
        List<String> parsedStrings = parsing(inputString, ",");
        for (String parsedString : parsedStrings) {
            List<String> parts = parsing(parsedString, "-");
            String menuName = parts.get(0);
            int quantity = parseToInt(parts.get(1));
            validateQuantity(quantity);
            System.out.println(menuName);
            Category category = Category.validateMenu(menuName);
            System.out.println(category);

        }

        return parsedStrings;
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
            System.out.println(ExceptionMessage.MENU_INCORRECT_FORMAT);
            return readMenu();
        }
    }
}
