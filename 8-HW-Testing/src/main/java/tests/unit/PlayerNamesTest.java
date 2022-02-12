package main.java.tests.unit;


import main.java.game.service.Game;
import main.java.game.service.Player;
import main.java.tests.unit.fake.DiceStab;
import main.java.tests.unit.fake.GameWinnerPrinterSpy;

import java.util.ArrayList;
import java.util.List;

public class PlayerNamesTest {

    public void runTest() {
        String scenario = "Проверка на уникальность имен игроков";

        try {
            List<String> actual = new ArrayList<>();
            Game game = new Game(new DiceStab(), new GameWinnerPrinterSpy(actual));

            Player player1 = new Player("Вася");
            Player player2 = new Player("Игорь");

            game.playGame(player1, player2);
            game.playGame(player2, player1);

            if (actual.get(0).equalsIgnoreCase(actual.get(1))) {
                throw new Exception();
            }

            System.out.printf("\"%s\" passed %n", scenario);

        } catch (Exception e) {
            String errorName = "Имена игроков совпадают";
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, errorName);
        }


    }

}
