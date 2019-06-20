package be.smals.fibonacci.service;

import be.smals.fibonacci.Exception.FibonacciException;

import java.util.List;

public interface FibonacciService {
    List<Integer> calcFibonacciRow(int numberAmount) throws FibonacciException;
    int calcFibonacciTerm(int term) throws FibonacciException;
}
