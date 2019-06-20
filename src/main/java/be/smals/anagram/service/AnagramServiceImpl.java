package be.smals.anagram.service;

import be.smals.anagram.exception.AnagramException;

import java.util.Arrays;

public class AnagramServiceImpl implements AnagramService {
    @Override
    public boolean isAnagram(String word1, String word2) throws AnagramException {
        char[] str1 =word1.toCharArray();
        char[] str2 =word2.toCharArray();

        if (str1.length == 0 || str2.length == 0) {
            throw new AnagramException("Please don't enter empty Strings");
        }

        // Get lenghts of both strings
        int n1 = str1.length;
        int n2 = str2.length;

        // If length of both strings is not same,
        // then they cannot be anagram
        if (n1 != n2)
            return false;

        // Sort both strings
        Arrays.sort(str1);
        Arrays.sort(str2);

        // Compare sorted strings
        for (int i = 0; i < n1; i++)
            if (str1[i] != str2[i])
                return false;

        return true;
    }
}

