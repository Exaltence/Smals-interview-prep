package be.smals.primepair.service;

import be.smals.primepair.exception.PrimePairException;

import java.util.ArrayList;
import java.util.List;

public class PrimePairServiceImpl implements PrimePairService {

    @Override
    public List<String> calculatePrimePair(int endLimit) throws PrimePairException {
        if (endLimit < 0) throw new PrimePairException("Please enter a positive endlimit");
        List<String> result = new ArrayList<>();
        for (int i = 2; i < endLimit; i++) {
            if (isPrime(i) && isPrime(i + 2)) {
                int primeOne = i;
                int primeTwo = i + 2;
                result.add(primeOne + " " + primeTwo);
            }
        }
        return result;
    }

    private boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
