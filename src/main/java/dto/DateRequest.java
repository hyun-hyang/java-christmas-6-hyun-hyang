package dto;

import static exception.ExceptionMessage.DATE_NOT_IN_RANGE;

import camp.nextstep.edu.missionutils.Console;
import exception.ExceptionMessage;
import java.util.Date;

public class DateRequest {

    private int date;

    public DateRequest(String inputString){
        int inputInt = parseToInt(inputString);
        validateDateRange(inputInt);
        this.date = inputInt;
    }

    public int getDate(){
        return date;
    }

    private static int parseToInt(String inputString) {
        try{
            return Integer.parseInt(inputString);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(ExceptionMessage.DATE_INCORRECT_FORMAT.toString());

        }
    }

    private static void validateDateRange(int inputInt) {
        if((inputInt < 1) || (inputInt > 31)) {
            throw new IllegalArgumentException(DATE_NOT_IN_RANGE.toString());
        }
    }
}
