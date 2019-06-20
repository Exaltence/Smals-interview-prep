package be.smals.anagram.service;

import be.smals.anagram.exception.AnagramException;

public interface AnagramService {
    boolean isAnagram(String word1, String word2) throws AnagramException;
}
