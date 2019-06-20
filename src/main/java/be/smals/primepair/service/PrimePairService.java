package be.smals.primepair.service;

import be.smals.primepair.exception.PrimePairException;

import java.util.List;

public interface PrimePairService {
    List<String> calculatePrimePair(int highestNumber) throws PrimePairException;
}
