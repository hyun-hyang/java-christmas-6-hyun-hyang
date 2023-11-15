package dto;

import domain.Category;

public class GiftMenuResponse {

    private static boolean hasChampagne;

    public GiftMenuResponse(){
        hasChampagne = false;
        if(TotalOrderAmountBeforeDiscountResponse.getPriceBeforeDiscount() >= 120000){
            hasChampagne = true;
        }
    }

    @Override
    public String toString(){
        if(hasChampagne){
            return "샴페인 1개";
        }
        return "없음";
    }



}
