package main.java.tests.unit.fake;

import main.java.game.service.Dice;

public class DiceStabDraw implements Dice {

    @Override
    public int roll(){
        return 5;
    }

}
