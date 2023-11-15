package dto;

import domain.Category;

public class TotalOrderAmountBeforeDiscountResponse {
    private final int priceBeforeDiscount;

    public TotalOrderAmountBeforeDiscountResponse(){
        int total = 0;
        for(Category category : Category.values()){
            total+= category.getPrice();
        }
        this.priceBeforeDiscount = total;
        String formattedNumber = String.format("%,d원", total);
        System.out.println(formattedNumber);
    }

}
