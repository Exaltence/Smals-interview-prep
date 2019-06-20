package be.smals.magicSquare.service;

import be.smals.magicSquare.exception.MagicSquareException;

public interface MagicSquareService {
    int[][] generateSquare(int rowsAndColumns) throws MagicSquareException;
}
