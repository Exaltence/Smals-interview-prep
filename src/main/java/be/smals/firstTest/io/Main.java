package be.smals.firstTest.io;

public class Main {
    public static void main(String[] args) {
        FibonacciController fc =  new FibonacciController(new ConsoleWriter(), new ConsoleReader());
        fc.run();
    }
}
