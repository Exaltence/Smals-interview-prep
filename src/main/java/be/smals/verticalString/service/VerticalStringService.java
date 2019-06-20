package be.smals.verticalString.service;

import be.smals.verticalString.exception.VerticalStringException;

import java.util.ArrayList;
import java.util.List;

public interface VerticalStringService {
    List<List<String>> makeVerticalText(List<String> sentences) throws VerticalStringException;
}
