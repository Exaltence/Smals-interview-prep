package be.smals.magicSquare.util;

public class PrintUtil {
    public static String printMagicSquare(int[][] magicSquare){
        StringBuilder sb = new StringBuilder();

        for (int[] row : magicSquare) {
            for (int column : row) {
                sb.append(column);
                sb.append("\t");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
