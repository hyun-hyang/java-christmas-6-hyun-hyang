package exception;

public enum ExceptionMessage {
    //Date
    DATE_INCORRECT_FORMAT("유효하지 않은 날짜입니다. 다시 입력해 주세요. 숫자만 입력해야합니다."),
    DATE_NOT_IN_RANGE("유효하지 않은 날짜입니다. 다시 입력해 주세요. 1~31 범위안에서 입력해야합니다."),
    //Menu
    MENU_NOT_IN_MENU("유효하지 않은 주문입니다. 다시 입력해 주세요. 메뉴에 없는 입력입니다."),
    MENU_NOT_IN_RANGE("유효하지 않은 주문입니다. 다시 입력해 주세요. 메뉴는 1개 이상 입력해야합니다."),
    MENU_INCORRECT_FORMAT("유효하지 않은 주문입니다. 다시 입력해 주세요. 잘못된 형식의 입력입니다."),
    MENU_DUPLICATE_MENUS("유효하지 않은 주문입니다. 다시 입력해 주세요. 메뉴가 중복되었습니다."),
    MENU_ONLY_BEVERAGE("음료만 주문되었습니다."),
    MENU_MAX_ORDERNUM("주문은 최대 20개만 할 수 있습니다."),
    ;

    private final String exceptionMessage;
    private final String ERROR_HEADER = "[ERROR] ";

    ExceptionMessage(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }

    @Override
    public String toString() {
        return ERROR_HEADER + exceptionMessage;
    }
}
