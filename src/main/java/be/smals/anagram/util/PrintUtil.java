package be.smals.anagram.util;

public class PrintUtil {
    public static String anagramOutput(boolean isAnagram, String str1, String str2){
        StringBuilder sb = new StringBuilder();
        sb.append(str1).append(" and ").append(str2);
        sb.append(isAnagram? " is an anagram " : " is not an Anagram ");


        return sb.toString();
    }
}
