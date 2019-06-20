package be.smals.directoryPrint.io;


public class ConsolePrinter implements Printer {

    @Override
    public void printLine(String message) {
        System.out.println(message);
    }
}
