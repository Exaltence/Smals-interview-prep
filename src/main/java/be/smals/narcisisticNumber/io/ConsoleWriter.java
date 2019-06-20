package be.smals.narcisisticNumber.io;

public class ConsoleWriter implements Writer {
    @Override
    public void printLine(String message) {
        System.out.println(message);
    }
}
