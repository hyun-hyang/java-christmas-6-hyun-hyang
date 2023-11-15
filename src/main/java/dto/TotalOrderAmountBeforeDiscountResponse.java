package dto;

import domain.Category;

public class TotalOrderAmountBeforeDiscountResponse {
    private static int priceBeforeDiscount;

    public TotalOrderAmountBeforeDiscountResponse(){
        int total = 0;
        for(Category category : Category.values()){
            total+= category.getPrice();
        }
        this.priceBeforeDiscount = total;

    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        String formattedNumber = String.format("%,d원", priceBeforeDiscount);
        stringBuilder.append(formattedNumber);
        return stringBuilder.toString();
    }

    static public int getPriceBeforeDiscount() {
        return priceBeforeDiscount;
    }
}
