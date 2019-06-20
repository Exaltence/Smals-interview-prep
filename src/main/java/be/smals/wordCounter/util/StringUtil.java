package be.smals.wordCounter.util;

public class StringUtil {
    public static final String PUNCTIONS = "\\p{Punct}";
    public static final String SPACE = " ";
    public static final String NEW_LINE = "\n";

    public static String removePunctions(String sentence){
        return sentence.replaceAll(PUNCTIONS, SPACE);
    }

    public static String[] splitOnSpace(String sentence) {
        return sentence.split(SPACE);
    }

}
