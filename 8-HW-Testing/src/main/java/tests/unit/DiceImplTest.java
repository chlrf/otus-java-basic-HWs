package main.java.tests.unit;

import main.java.game.service.DiceImpl;

public class DiceImplTest {

    public void testDiceImplForN() {
        String scenario = "Тест диапазона значений, выбрасываемых кубиком";
        try {
            DiceImpl diceImpl = new DiceImpl();

            for (int i = 0; i < 10; i++) {
                int actual = diceImpl.roll();
                if (actual >= 1 & actual <= 6) {
                    System.out.printf("\"%s\" passed %n", scenario);
                } else {
                    throw new Exception();
                }
            }
        } catch (Exception e) {
            String errorName = "Значение вне диапазона 1-6";
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, errorName);
        }
    }

}
