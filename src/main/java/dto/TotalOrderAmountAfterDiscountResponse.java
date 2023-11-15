package dto;

public class TotalOrderAmountAfterDiscountResponse {
    private int price;
    public TotalOrderAmountAfterDiscountResponse(){
        int priceBeforeDiscount = TotalOrderAmountBeforeDiscountResponse.getPriceBeforeDiscount();
        int discount = DiscountResponse.getDiscount();
        this.price = priceBeforeDiscount - discount;
    }

    @Override
    public String toString(){
        return String.format("%,d원", price);
    }
}
