package be.smals.narcisisticNumber.service;

import be.smals.narcisisticNumber.exception.NarcisticNumberException;

import java.util.List;

public interface NarcisticNumberService {
    boolean isNarcisisticNumber(int number) throws NarcisticNumberException;
    List<Integer> calcNarcisisticRow(int amount) throws NarcisticNumberException;
}
