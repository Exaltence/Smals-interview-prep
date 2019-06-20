package be.smals.fizbuzz.controller;

import be.smals.fizbuzz.exception.FizBuzzException;
import be.smals.fizbuzz.io.Printer;
import be.smals.fizbuzz.io.Reader;
import be.smals.fizbuzz.service.FizBuzzService;

public class FizBuzzController {
    private final FizBuzzService fizbuzzService;
    private final Printer printer;

    public FizBuzzController(FizBuzzService fizbuzzService, Printer printer) {
        this.fizbuzzService = fizbuzzService;
        this.printer = printer;
    }

    public void checkAndPrintFizzBuzz(String number) {
        try {
            String result = this.fizbuzzService.checkForFizzBuzz(number);
            this.printer.printLine(result);
        } catch (FizBuzzException e) {
            this.printer.printLine(e.getMessage());
        }
    }
}
