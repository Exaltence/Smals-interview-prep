package be.smals.verticalString;

import be.smals.verticalString.controller.VerticalStringController;
import be.smals.verticalString.io.ConsolePrinter;
import be.smals.verticalString.service.VerticalStringServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class VerticalStringMain {

    public static void main(String[] args) {
        List<String> sentences = new ArrayList<>();
        sentences.add("test sentence 1");
        sentences.add("test sentence 2");
        sentences.add("test sentence 63");

        VerticalStringController verticalStringController = new VerticalStringController(new VerticalStringServiceImpl(), new ConsolePrinter());
        verticalStringController.createAndPrintVerticalString(sentences);
    }
}
