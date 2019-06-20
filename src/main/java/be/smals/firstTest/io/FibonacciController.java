package be.smals.firstTest.io;

import java.util.List;

public class FibonacciController {
    private final Writer writer;
    private final Reader reader;

    public FibonacciController(Writer writer, Reader reader){
        this.writer = writer;
        this.reader = reader;
    }

    public void run(){
        try {
            writer.writeLine("Enter fibonacci limit:");
            int limit = Integer.parseInt(reader.readLine());
            Fibonacci fibonacci = new Fibonacci();
            List<Integer> fibonacciRow = fibonacci.calculateFibonacci(limit);
            writer.writeLine(fibonacciRow.toString());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
