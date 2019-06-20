package be.smals.verticalString.util;

import java.util.List;

public class PrintUtil {

    public static void printMatrix(List<List<String>> matrix, int maxLength) {
        StringBuilder sb = new StringBuilder();

        for(int col = 0; col < maxLength; col++) {
            for(int row = 0; row < matrix.size(); row++) {
                try {
                    System.out.format("%-15s", matrix.get(row).get(col));
                }
                catch(IndexOutOfBoundsException e) {
                    System.out.format("%-15s", "");
                }
            }
            System.out.println();
        }
    }
}
