package be.smals.narcisisticNumber.util;

public class PrintUtil {

    public static String printIsNarcisticNumber(int number, boolean result) {
        return String.format("%d is a %s narcistic number!", number, result ? "": "not");
    }
}
