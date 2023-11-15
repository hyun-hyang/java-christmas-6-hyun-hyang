package view;

import dto.BenefitDetailsResponse;
import dto.DecemberEventBadgeResponse;
import dto.DiscountResponse;
import dto.GiftMenuResponse;
import dto.MenuOrderResultResponse;
import dto.TotalOrderAmountAfterDiscountResponse;
import dto.TotalOrderAmountBeforeDiscountResponse;

public class OutputView {
    private final static String SERVICE_START = "12월 3일에 우테코 식당에서 받을 이벤트 혜택 미리 보기!";
    private final static String MENU_ORDER_RESULT = "\n<주문 메뉴>";
    private final static String TOTAL_ORDER_AMOUNT_BEFORE_DISCOUNT = "<할인 전 총주문 금액>";
    private final static String GIFT_MENU = "\n<증정 메뉴>";
    private final static String BENEFIT_DETAILS = "\n<혜택 내역>";
    private final static String DISCOUNT = "\n<총혜택 금액>";
    private final static String TOTAL_ORDER_AMOUNT_AFTER_DISCOUNT = "\n<할인 후 예상 결제 금액>";
    private final static String DECEMBER_EVENT_BADGE = "\n<12월 이벤트 배지>";

    public void printServiceStart(){
        System.out.println(SERVICE_START);
    }

    public void printMenuOrderResult(MenuOrderResultResponse response){
        System.out.println(MENU_ORDER_RESULT);
        System.out.println(response);
    }

    public void printTotalOrderAmountBeforeDiscount(TotalOrderAmountBeforeDiscountResponse response ){
        System.out.println(TOTAL_ORDER_AMOUNT_BEFORE_DISCOUNT);
        System.out.println(response);
    }

    public void printGiftMenu(GiftMenuResponse response){
        System.out.println(GIFT_MENU);
        System.out.println(response);
    }

    public void printBenefitDetails(BenefitDetailsResponse response){
        System.out.println(BENEFIT_DETAILS);
        System.out.println(response);
    }

    public void printDiscount(DiscountResponse response){
        System.out.println(DISCOUNT);
        System.out.println(response);
    }

    public void printTotalOrderAmountAfterDiscount(TotalOrderAmountAfterDiscountResponse response){
        System.out.println(TOTAL_ORDER_AMOUNT_AFTER_DISCOUNT);
        System.out.println(response);
    }

    public void printDecemberEventBadge(DecemberEventBadgeResponse response){
        System.out.println(DECEMBER_EVENT_BADGE);
        System.out.println(response);
    }




}
