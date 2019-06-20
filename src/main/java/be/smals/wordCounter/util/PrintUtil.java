package be.smals.wordCounter.util;

import java.util.Iterator;
import java.util.Map;

public class PrintUtil {

    public static String provideOutput(Map result) {
        StringBuilder sb = new StringBuilder();
        Iterator<Map.Entry> iter = result.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = iter.next();
            sb.append(entry.getValue());
            sb.append(" word of ");
            sb.append(entry.getKey());
            sb.append(" characters");
            sb.append("\n");
        }
        return sb.toString();
    }
}
