package be.smals.primepair.util;

import java.util.List;

public class PrintUtil {
    public static String printResult(List<String> toPrint){
        StringBuilder sb = new StringBuilder();
        for(String string: toPrint){
            sb.append(string);
            sb.append("\n");
        }
        return sb.toString();
    }
}
