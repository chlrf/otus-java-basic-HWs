package main.java.tests;

import main.java.tests.unit.DiceImplTest;
import main.java.tests.unit.DrawTest;
import main.java.tests.unit.GameTest;
import main.java.tests.unit.PlayerNamesTest;

public class AllTests {
    public static void main(String[] args) {

        new DiceImplTest().testDiceImplForN();

        new GameTest().testGame();

        new DrawTest().runTest();

        new PlayerNamesTest().runTest();


    }
}
