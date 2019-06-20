package be.smals.wordCounter.service;

import be.smals.wordCounter.exception.WordCountException;
import java.util.Map;

public interface WordCounterService {
    Map wordLengthOccurenceCalculator (String wordsToCount) throws WordCountException;
}
