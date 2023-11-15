package controller;

import static domain.Category.onlyOrderLeft;

import domain.Category;
import dto.BenefitDetailsResponse;
import dto.DateRequest;
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


    public DecemberEventPlanner(){
        this.inputView = new InputView();
        this.outputView = new OutputView();
        play();
    }

    private void play() {
        DateRequest dateRequest = getDate();
        this.date = dateRequest.getDate();

        Category.onlyOrderLeft();
        printOrderBeforeBenefit();
        printOrderAfterBenefit();
    }

    private DateRequest getDate() {
        try{
            return inputView.readDate();
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            return getDate();
        }
    }

    private MenuRequest getMenu() {
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
