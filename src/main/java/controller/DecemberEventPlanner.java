package controller;

import static domain.Category.onlyOrderLeft;

import domain.Category;
import dto.BenefitDetailsResponse;
import dto.DecemberEventBadgeResponse;
import dto.DiscountResponse;
import dto.GiftMenuResponse;
import dto.MenuOrderResultResponse;
import dto.MenuRequest;
import dto.TotalOrderAmountAfterDiscountResponse;
import dto.TotalOrderAmountBeforeDiscountResponse;
import java.util.List;
import view.InputView;
import view.OutputView;

public class DecemberEventPlanner {
    private final InputView inputView;
    private final OutputView outputView;

    int date;
    String menu;


    public DecemberEventPlanner(){
        this.inputView = new InputView();
        this.outputView = new OutputView();
        play();
    }

    private void play() {
        this.date = getDate();
        MenuRequest menuRequest = new MenuRequest(getMenu());
        Category.onlyOrderLeft();
        printOrderBeforeBenefit();
        printOrderAfterBenefit();
    }

    private int getDate() {
        try{
            return InputView.readDate();
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            return getDate();
        }
    }

    private String getMenu() {
        try{
            return InputView.readMenu();
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            return getMenu();
        }
    }

    private void printOrderBeforeBenefit() {
        outputView.printServiceStart();
        outputView.printMenuOrderResult(new MenuOrderResultResponse());
        outputView.printTotalOrderAmountBeforeDiscount(new TotalOrderAmountBeforeDiscountResponse());
        outputView.printGiftMenu(new GiftMenuResponse());
    }

    private void printOrderAfterBenefit() {
        outputView.printBenefitDetails(new BenefitDetailsResponse(this.date));
        outputView.printDiscount(new DiscountResponse());
        outputView.printTotalOrderAmountAfterDiscount(new TotalOrderAmountAfterDiscountResponse());
        outputView.printDecemberEventBadge(new DecemberEventBadgeResponse());
    }


}
