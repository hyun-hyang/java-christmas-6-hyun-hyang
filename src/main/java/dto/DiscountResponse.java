package dto;

public class DiscountResponse {

    private static int discount;

    public DiscountResponse(){
        int total = 0;
        total += BenefitDetailsResponse.getGiftMenuEvent();
        total += BenefitDetailsResponse.getSpecialDiscount();
        total += BenefitDetailsResponse.getWeekdayDiscount();
        total += BenefitDetailsResponse.getChristmasDiscount();
        this.discount = total;
    }

    static public int getDiscount(){
        return discount;
    }

    @Override
    public String toString(){
        return "-" + String.format("%,d원", discount);
    }
}
