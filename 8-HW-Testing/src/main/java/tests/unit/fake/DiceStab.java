package main.java.tests.unit.fake;

import main.java.game.service.Dice;

public class DiceStab implements Dice {
    boolean isFirstPlayerThrowing = true;
    @Override
    public int roll(){
        if (isFirstPlayerThrowing ){
            isFirstPlayerThrowing  = false;
            return 5;
        }
        else {
            isFirstPlayerThrowing  = true;
            return 3;
        }

    }
}
