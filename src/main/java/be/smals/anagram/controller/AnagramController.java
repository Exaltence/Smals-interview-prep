package be.smals.anagram.controller;

import be.smals.anagram.exception.AnagramException;
import be.smals.anagram.io.Printer;
import be.smals.anagram.service.AnagramService;
import be.smals.anagram.util.PrintUtil;

public class AnagramController {
    private final AnagramService anagramService;
    private final Printer printer;

    public AnagramController(AnagramService anagramService, Printer printer) {
        this.anagramService = anagramService;
        this.printer = printer;
    }

    public void checkAndPrintIsAnagram(String str1, String str2){
        try{
            boolean isAnagram = this.anagramService.isAnagram(str1, str2);
            this.printer.printLine(PrintUtil.anagramOutput(isAnagram,str1, str2));
        }catch (AnagramException e){
            this.printer.printLine(e.getMessage());
        }
    }
}
