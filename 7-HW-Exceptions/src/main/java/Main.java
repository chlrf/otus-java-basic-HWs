package main.java;

import main.java.myExceptions.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Вариант обработки исключения №1
        new EvenNumberException(scanner).getNumber();

        //Вариант обработки исключения №2
        ArrayIndexException arrayIndexException = new ArrayIndexException(scanner);
        try {
            arrayIndexException.getArrayElement();
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Ошибка! Такого индеска нет (исключение поймано в методе main)");

        } finally {
            System.out.println("---------- КОНЕЦ ВАРИАНТА №2 ---------------- \n");
        }
        scanner.close();

        //Вариант обработки исключения №3
        try (OuterResources test = new OuterResources()) {
            System.out.println("\n-------- ВАРИАНТ ОБРАБОТКИ ИСКЛЮЧЕНИЯ №3 - Try with resources -------------");
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("---------- КОНЕЦ ВАРИАНТА №3 ---------------- \n");
        }
    }
}



