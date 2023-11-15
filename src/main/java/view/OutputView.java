package view;

import camp.nextstep.edu.missionutils.Console;
import domain.Category;
import dto.MenuOrderResultResponse;
import dto.TotalOrderAmountBeforeDiscountResponse;

public class OutputView {
    private final static String SERVICE_START = "12월 3일에 우테코 식당에서 받을 이벤트 혜택 미리 보기!";
    private final static String MENU_ORDER_RESULT = "\n<주문 메뉴>";
    private final static String TOTAL_ORDER_AMOUNT_BEFORE_DISCOUNT = "\n<할인 전 총주문 금액>";
    private final static String GIFT_MENU = "\n<증정 메뉴>";
    private final static String BENEFIT_DETAILS = "\n<혜택 내역>";
    private final static String DISCOUNT = "\n<총혜택 금액>";
    private final static String TOTAL_ORDER_AMOUNT_AFTER_DISCOUNT = "\n<할인 후 예상 결제 금액>";
    private final static String DECEMBER_EVENT_BADGE = "\n<12월 이벤트 배지>";

    public void printServiceStart(){
        System.out.println(SERVICE_START);
    }

    public void printMenuOrderResult(){
        System.out.println(MENU_ORDER_RESULT);
        MenuOrderResultResponse menuOrderResultResponse = new MenuOrderResultResponse();
    }

    public void printTotalOrderAmountBeforeDiscount(){
        System.out.println(TOTAL_ORDER_AMOUNT_BEFORE_DISCOUNT);
        TotalOrderAmountBeforeDiscountResponse totalOrderAmountBeforeDiscountResponse = new TotalOrderAmountBeforeDiscountResponse();

    }

    public void printGiftMenu(){
        System.out.println(GIFT_MENU);
    }

    public void printBenefitDetails(){
        System.out.println(BENEFIT_DETAILS);
    }

    public void printDiscount(){
        System.out.println(DISCOUNT);
    }

    public void printTotalOrderAmountAfterDiscount(){
        System.out.println(TOTAL_ORDER_AMOUNT_AFTER_DISCOUNT);
    }

    public void printDecemberEventBadge(){
        System.out.println(DECEMBER_EVENT_BADGE);
    }




}
