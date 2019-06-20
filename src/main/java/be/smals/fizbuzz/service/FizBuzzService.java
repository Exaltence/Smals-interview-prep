package be.smals.fizbuzz.service;

import be.smals.fizbuzz.exception.FizBuzzException;

public interface FizBuzzService {
    String checkForFizzBuzz(String number) throws FizBuzzException;
}
