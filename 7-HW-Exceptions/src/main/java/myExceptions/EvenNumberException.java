package main.java.myExceptions;

import java.util.Scanner;

public class EvenNumberException {
    Scanner sc;

    public EvenNumberException(Scanner sc) {
        this.sc = sc;
    }

    public void getNumber() {
        System.out.println("\n-------- ВАРИАНТ ОБРАБОТКИ ИСКЛЮЧЕНИЯ №1 - ВЫВОД ОШИБКИ -------------");
        System.out.print("Введите НЕЧЕТНОЕ число: ");
        int a = sc.nextInt();
        try {
            if (a % 2 == 0) {
                throw new ArithmeticException();
            }
            System.out.println("OK");
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("Ошибка, введено четное число\n");


        } finally {
            System.out.println("---------- КОНЕЦ ВАРИАНТА №1 ---------------- \n");

        }

    }

}
