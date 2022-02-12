package main.java.tests.unit;

import main.java.game.service.*;

import main.java.tests.unit.fake.DiceStabDraw;
import main.java.tests.unit.fake.GameWinnerPrinterSpy;

import java.util.ArrayList;
import java.util.List;

public class DrawTest {

    public void runTest(){
        String scenario = "Проверка вывода при ничьей";
        try {

            Player player1 = new Player("Player 1");
            Player player2 = new Player("Player 2");

            List<String> actual = new ArrayList<>();

            Dice diceStabDraw = new DiceStabDraw();
            GameWinnerPrinter winnerPrinterStab = new GameWinnerPrinterSpy(actual);

            Game game = new Game(diceStabDraw, winnerPrinterStab);
            game.playGame(player1, player2);

            if (actual.get(0).equals(player1.getName()) || actual.get(0).equals(player2.getName())){
                throw new Exception();
            }

            System.out.printf("\"%s\" passed %n", scenario);


        } catch (Exception e){
            String errorName = "Выводится победитель, хотя ничья ";
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, errorName);
        }





    }

}
