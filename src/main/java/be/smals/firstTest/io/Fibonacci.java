package be.smals.firstTest.io;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public List<Integer> calculateFibonacci(int limit){
        int a=0, b=1;
        List<Integer> fibonacciList = new ArrayList<>();

        for(int i=0; i< limit; i++){
            fibonacciList.add(a);
            int sum = a+b;
            a=b;
            b = sum;
        }
        return fibonacciList;
    }
}
