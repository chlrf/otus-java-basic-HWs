package main.java.myExceptions;

public class OuterResources implements AutoCloseable{
    @Override
    public void close() {
        System.out.println("Вызван метод close в классе main.java.myExceptions.OuterResources");
    }
}
