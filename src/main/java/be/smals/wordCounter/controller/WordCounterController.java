package be.smals.wordCounter.controller;

import be.smals.wordCounter.exception.WordCountException;
import be.smals.wordCounter.io.Printer;
import be.smals.wordCounter.service.WordCounterService;
import be.smals.wordCounter.util.PrintUtil;

import java.util.List;
import java.util.Map;

public class WordCounterController {
    private final WordCounterService wordCounterService;
    private final Printer printer;

    public WordCounterController(WordCounterService wordCounterService, Printer printer) {
        this.wordCounterService = wordCounterService;
        this.printer = printer;
    }

    public void countAndPrintWords(String wordsToCount){
        try{
            Map result = this.wordCounterService.wordLengthOccurenceCalculator(wordsToCount);
            this.printer.printLine(PrintUtil.provideOutput(result));
        }catch(WordCountException e){
            this.printer.printLine(e.getMessage());
        }
    }
}
