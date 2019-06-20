package be.smals.verticalString.service;

import be.smals.verticalString.exception.VerticalStringException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class VerticalStringServiceImpl implements VerticalStringService {

    @Override
    public List<List<String>> makeVerticalText(List<String> sentences) throws VerticalStringException {
        if (sentences== null || sentences.isEmpty() || sentences.size() == 0) {
            throw new VerticalStringException("input can't be empty");
        }

        List<List<String>> matrix = new ArrayList<List<String>>();
        int maxLength = Integer.MIN_VALUE;

        for(String sentence : sentences) {
            List<String> words = Arrays.asList(sentence.split(" "));
            maxLength = Math.max(maxLength, words.size());

            matrix.add(words);
        }
        return matrix;
    }
}
