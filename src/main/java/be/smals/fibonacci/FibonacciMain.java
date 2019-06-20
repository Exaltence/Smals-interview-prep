package be.smals.fibonacci;

import be.smals.fibonacci.controller.FibonacciController;
import be.smals.fibonacci.io.ConsoleWriter;
import be.smals.fibonacci.service.FibonacciServiceImpl;

public class FibonacciMain {
    public static void main(String[] args) {
        FibonacciController fibonacciController = new FibonacciController(new ConsoleWriter(), new FibonacciServiceImpl());
        fibonacciController.calculateAndPrintFibonacciRow(10);
        fibonacciController.calculateAndPrintFibonacciTerm(3);
    }
}
