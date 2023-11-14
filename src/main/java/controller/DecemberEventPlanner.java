package controller;

import exception.ExceptionMessage;
import view.InputView;

public class DecemberEventPlanner {

    public DecemberEventPlanner(){
        play();
    }

    private void play() {
        getDate();
        getMenu();
    }

    private int getDate() {
        try{
            return InputView.readDate();
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            return getDate();
        }
    }

    private void getMenu() {
        try{
            return InputView.readMenu();
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            return getMenu();
        }
    }
}
