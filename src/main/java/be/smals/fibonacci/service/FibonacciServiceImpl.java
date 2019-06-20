package be.smals.fibonacci.service;

import be.smals.fibonacci.Exception.FibonacciException;

import java.util.ArrayList;
import java.util.List;

public class FibonacciServiceImpl implements FibonacciService {

    @Override
    public List<Integer> calcFibonacciRow(int numberAmount) throws FibonacciException {
        if (numberAmount <= 0) {
            throw new FibonacciException("Please enter a number greater than 0.");
        }

        int a = 0, b = 1;
        List<Integer> fibonacciResult = new ArrayList<>();
        for (int i = 0; i < numberAmount; i++) {
            fibonacciResult.add(a);
            int sum = a + b;
            a = b;
            b = sum;
        }
        return fibonacciResult;
    }

    @Override
    public int calcFibonacciTerm(int term) throws FibonacciException {
        if (term <= 1) {
            return term;
        } else {
            return calcFibonacciTerm(term - 1) + calcFibonacciTerm(term - 2);
        }
    }
}
