package main.java.myExceptions;

import java.util.Scanner;

public class ArrayIndexException {
    Scanner sc;

    public ArrayIndexException(Scanner sc) {
        this.sc = sc;
    }

    public void getArrayElement() throws MyException {

        int[] array = new int[]{5, 8, 11, 4};
        System.out.println("\n-------- ВАРИАНТ ОБРАБОТКИ ИСКЛЮЧЕНИЯ №2 - Rethrow -------------");
        System.out.print("Введите индекс массива для получения элемента: ");
        int index = sc.nextInt();

        try {
            int element = array[index];
            System.out.println("Элемент найден, это число " + element);

        } catch (Exception e) {
            throw new MyException("Сделан rethrow", e);
        }
    }
}
