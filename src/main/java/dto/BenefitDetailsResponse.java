package dto;

import domain.Category;

public class BenefitDetailsResponse {

    private int date;
    private static int ChristmasDiscount;
    private static int WeekdayDiscount;
    private static int SpecialDiscount;
    private static int GiftMenuEvent;

    public BenefitDetailsResponse(int date){
        this.date = date;
        this.ChristmasDiscount = checkChristmasDiscount();
        this.WeekdayDiscount = checkWeekdayDiscount();
        this.SpecialDiscount = checkSpecialDiscount();
        this.GiftMenuEvent = checkGiftMenuEvent();
    }

    public static int getChristmasDiscount() {
        return ChristmasDiscount;
    }

    public static int getGiftMenuEvent() {
        return GiftMenuEvent;
    }

    public static int getSpecialDiscount() {
        return SpecialDiscount;
    }

    public static int getWeekdayDiscount() {
        return WeekdayDiscount;
    }

    public int checkChristmasDiscount(){
        return 1000 + (25 - date) * 100;
    }

    public int checkWeekdayDiscount(){
        if(checkWeekday()){
            return Category.MAIN.getPrice();
        }
        return Category.DESSERT.getPrice();
    }

    public boolean checkWeekday(){
        int num = date % 7;
        return (num == 1) || (num == 2);
    }

    public int checkSpecialDiscount(){
        if(checkSpecialday()){
            return 1000;
        }
        return 0;
    }

    public boolean checkSpecialday(){
        int num = date % 7;
        return (num == 3) || (date == 25);
    }

    public int checkGiftMenuEvent(){
        if(GiftMenuResponse.getHasChampagne()){
            return 25000;
        }
        return 0;
    }

    @Override
    public String toString(){
        int discount = DiscountResponse.getDiscount();
        if(discount != 0){
            return "크리스마스 디데이 할인: -" + String.format("%,d원\n", ChristmasDiscount)
                    + "평일 할인: -" + String.format("%,d원\n", WeekdayDiscount)
                    + "특별 할인: -" + String.format("%,d원\n", SpecialDiscount)
                    + "증정 이벤트: -" + String.format("%,d원", GiftMenuEvent);
        }
        return "없음";
    }
}
