package be.smals.anagram.io;

public class ConsolePrinter implements Printer {
    @Override
    public void printLine(String message) {
        System.out.println(message);
    }
}
