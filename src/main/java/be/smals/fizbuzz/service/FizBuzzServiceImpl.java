package be.smals.fizbuzz.service;

import be.smals.fizbuzz.exception.FizBuzzException;

public class FizBuzzServiceImpl implements FizBuzzService {

    public String checkForFizzBuzz(String word) throws FizBuzzException {
        if (word == null || word.isEmpty()) {
            throw new FizBuzzException("");
        }
        try {
            int number = Integer.parseInt(word);
            if (number % 15 == 0) {
                return "Fizbuzz";
            } else if (number % 5 == 0) {
                return "Fizz";
            } else if (number % 3 == 0) {
                return "Buzz";
            } else {
                return String.valueOf(number);
            }
        } catch (NumberFormatException e) {
            throw new FizBuzzException(e.getMessage());
        }
    }
}

