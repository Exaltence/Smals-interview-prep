package be.smals.wordCounter.service;

import be.smals.wordCounter.util.StringUtil;

import java.util.HashMap;
import java.util.Map;

public class WordCounterServiceImpl implements WordCounterService {
    @Override
    public Map<Integer, Integer> wordLengthOccurenceCalculator(String sentence) {
        sentence = StringUtil.removePunctions(sentence);
        String[] data = StringUtil.splitOnSpace(sentence);

        Map<Integer, Integer> resultMap = new HashMap<>();
        for (String s : data) {
            if (s.length() != 0) {
                resultMap.merge(s.length(), 1, Integer::sum);
            }
        }
        return resultMap;
    }
}

