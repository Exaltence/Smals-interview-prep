package be.smals.verticalString.controller;

import be.smals.verticalString.exception.VerticalStringException;
import be.smals.verticalString.io.Printer;
import be.smals.verticalString.util.PrintUtil;
import be.smals.verticalString.service.VerticalStringService;

import java.util.List;

public class VerticalStringController {
    private final VerticalStringService verticalStringService;
    private final Printer printer;

    public VerticalStringController(VerticalStringService verticalStringService, Printer printer) {
        this.verticalStringService = verticalStringService;
        this.printer = printer;
    }

    public void createAndPrintVerticalString(List<String> sentences){
        try {
            List<List<String>> result = this.verticalStringService.makeVerticalText(sentences);
            int maxLength = sentences.size();
            PrintUtil.printMatrix(result, maxLength);

        }catch(VerticalStringException e){
            this.printer.printLine(e.getMessage());
        }

    }
}
