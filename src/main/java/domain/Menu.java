package domain;

import exception.ExceptionMessage;

public enum Menu {
    MUSHROOM ("양송이수프",6_000),
    TAPAS ("타파스",5_500),
    SALAD ("시저샐러드",8_000),
    STEAK ("티본스테이크",55_000),
    BBQ ("바비큐립",54_000),
    SAEFOOD_PASTA ("해산물파스타",35_000),
    CHRISTMAS_PASTA ("크리스마스파스타",25_000),
    CHOCO_CAKE ("초코케이크",15_000),
    ICECREAM ("아이스크림",5_000),
    ZEROCOKE ("제로콜라",3_000),
    REDWINE ("레드와인",60_000),
    CHAMPAGNE ("샴페인",25_000);

    private final String name;
    private final int price;

    Menu(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public static Menu fromString(String stringValue) {
        for (Menu menu : Menu.values()) {
            if (menu.name.equals(stringValue)) {
                return menu;
            }
        }
        // 매칭되는 Enum 상수가 없을 경우 예외처리 또는 기본값 설정
        throw new IllegalArgumentException(ExceptionMessage.MENU_NOT_IN_MENU.toString());
    }

    public int getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
}
