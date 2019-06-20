package be.smals.magicSquare.service;

import be.smals.magicSquare.exception.MagicSquareException;

public class MagicSquareServiceImpl implements MagicSquareService {
    @Override
    public int[][] generateSquare(int rowsAndColumns) throws MagicSquareException {

        if (rowsAndColumns % 2 == 0) {
            throw new MagicSquareException("Rows and Columns can't be even.");
        }
        int[][] magicSquare = new int[rowsAndColumns][rowsAndColumns];

        // Initialize position for 1
        int i = rowsAndColumns / 2;
        int j = rowsAndColumns - 1;

        // One by one put all values in magic square
        for (int num = 1; num <= rowsAndColumns * rowsAndColumns; ) {
            if (i == -1 && j == rowsAndColumns) //3rd condition
            {
                j = rowsAndColumns - 2;
                i = 0;
            } else {
                //1st condition helper if next number
                // goes to out of square's right side
                if (j == rowsAndColumns) {
                    j = 0;
                }
                //1st condition helper if next number is
                // goes to out of square's upper side
                if (i < 0) {
                    i = rowsAndColumns - 1;
                }
            }
            //2nd condition
            if (magicSquare[i][j] != 0) {
                j -= 2;
                i++;
                continue;
            } else {
                magicSquare[i][j] = num++;
            }
            //1st condition
            j++;
            i--;
        }
        return magicSquare;
    }
}
