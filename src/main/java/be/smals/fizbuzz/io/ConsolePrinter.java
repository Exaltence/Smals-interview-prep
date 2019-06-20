package be.smals.fizbuzz.io;

public class ConsolePrinter implements Printer{
    @Override
    public void printLine(String value) {
        System.out.println(value);
    }
}
