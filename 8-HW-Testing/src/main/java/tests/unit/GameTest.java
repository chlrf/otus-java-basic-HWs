package main.java.tests.unit;

import main.java.assertions.Assertions;
import main.java.game.service.*;
import main.java.tests.unit.fake.*;
import java.util.ArrayList;
import java.util.List;


public class GameTest {

    public void testGame(){
        String scenario = "Проверка определения победителя";

        try {
            List<String> expected = List.of("Player 1");
            List<String> actual = new ArrayList<>();


            Dice diceStab = new DiceStab();
            GameWinnerPrinter winnerPrinterStab = new GameWinnerPrinterSpy(actual);

            Game game = new Game(diceStab, winnerPrinterStab);
            game.playGame(new Player("Player 1"), new Player("Player 2"));

            Assertions.assertEquals(expected.size(), actual.size());
            for (int i = 0; i < expected.size(); i++) {
                Assertions.assertEquals(expected.get(i), actual.get(i));
            }
            System.out.printf("\"%s\" passed %n", scenario);


        } catch (Throwable e){
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }










    }

}
