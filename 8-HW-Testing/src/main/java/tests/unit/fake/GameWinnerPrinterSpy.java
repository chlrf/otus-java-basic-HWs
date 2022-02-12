package main.java.tests.unit.fake;

import main.java.game.service.GameWinnerPrinter;
import main.java.game.service.Player;

import java.util.List;

public class GameWinnerPrinterSpy implements GameWinnerPrinter {

    private final List<String> actualFlow;

    public GameWinnerPrinterSpy(List<String> actualFlow) {
        this.actualFlow = actualFlow;
    }

    @Override
    public void printWinner(Player winner) {
        actualFlow.add(winner.getName());
    }


}

