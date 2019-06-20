package be.smals.wordCounter;

import be.smals.wordCounter.controller.WordCounterController;
import be.smals.wordCounter.io.ConsolePrinter;
import be.smals.wordCounter.service.WordCounterServiceImpl;

public class WordCounterMain {
    public static void main(String[] args) {
        WordCounterController wordCounterController = new WordCounterController(new WordCounterServiceImpl(), new ConsolePrinter());
        wordCounterController.countAndPrintWords("this is a test,!sentance.");
    }
}
