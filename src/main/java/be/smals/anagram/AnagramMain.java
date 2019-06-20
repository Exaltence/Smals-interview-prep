package be.smals.anagram;

import be.smals.anagram.controller.AnagramController;
import be.smals.anagram.io.ConsolePrinter;
import be.smals.anagram.service.AnagramServiceImpl;

public class AnagramMain {
    public static void main(String[] args) {
        AnagramController anagramController = new AnagramController(new AnagramServiceImpl(), new ConsolePrinter());
        anagramController.checkAndPrintIsAnagram("lepel","pelle");
        anagramController.checkAndPrintIsAnagram("test","toby");
    }
}
