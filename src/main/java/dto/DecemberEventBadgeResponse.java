package dto;

public class DecemberEventBadgeResponse {

    private String badge;

    public DecemberEventBadgeResponse(){
        int discount = DiscountResponse.getDiscount();
        this.badge = "없음";
        if(discount >= 5000){
            this.badge = "별";
        }
        if(discount >= 10000){
            this.badge = "트리";
        }
        if(discount >= 20000){
            this.badge = "산타";
        }
    }

    @Override
    public String toString(){
        return badge;
    }
}
