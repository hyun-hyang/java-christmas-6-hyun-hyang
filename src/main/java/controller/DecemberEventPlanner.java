package controller;

import domain.Category;
import java.util.List;
import view.InputView;
import view.OutputView;

public class DecemberEventPlanner {
    private final InputView inputView;
    private final OutputView outputView;

    int date;
    List<String> menu;


    public DecemberEventPlanner(){
        this.inputView = new InputView();
        this.outputView = new OutputView();
        play();
    }

    private void play() {
        this.date = getDate();
        this.menu = getMenu();
        System.out.println(date);
        System.out.println(menu);
        printOrderBeforeBenefit();
        printOrderAfterBenefit();
    }

    private void CategoryReady() {

    }

    private int getDate() {
        try{
            return InputView.readDate();
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            return getDate();
        }
    }

    private List<String> getMenu() {
        try{
            return InputView.readMenu();
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            return getMenu();
        }
    }

    private void printOrderBeforeBenefit() {
        outputView.printServiceStart();
        outputView.printMenuOrderResult();
        outputView.printTotalOrderAmountBeforeDiscount();
    }

    private void printOrderAfterBenefit() {
        outputView.printGiftMenu();
        outputView.printBenefitDetails();
        outputView.printDiscount();
        outputView.printTotalOrderAmountAfterDiscount();
        outputView.printDecemberEventBadge();
    }


}
