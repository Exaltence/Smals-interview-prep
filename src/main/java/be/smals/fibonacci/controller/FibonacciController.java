package be.smals.fibonacci.controller;

import be.smals.fibonacci.Exception.FibonacciException;
import be.smals.fibonacci.io.Writer;
import be.smals.fibonacci.service.FibonacciService;

import java.util.List;

public class FibonacciController {
    private final Writer writer;
    private final FibonacciService fibonacciService;

    public FibonacciController(Writer writer, FibonacciService fibonacciService){
        this.writer = writer;
        this.fibonacciService = fibonacciService;
    }

    public void calculateAndPrintFibonacciRow(int amountNumbers) {
        try{
            List<Integer> fibonacciRow = this.fibonacciService.calcFibonacciRow(amountNumbers);
            this.writer.printLine(fibonacciRow.toString());
        }catch(FibonacciException e){
            this.writer.printLine(e.getMessage());
        }
    }

    public void calculateAndPrintFibonacciTerm(int term) {
        try{
            int fibonacciTerm = this.fibonacciService.calcFibonacciTerm(term);
            this.writer.printLine(Integer.toString(fibonacciTerm));
        }catch(FibonacciException e){
            this.writer.printLine(e.getMessage());
        }
    }
}
