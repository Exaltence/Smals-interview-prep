package be.smals.narcisisticNumber.controller;

import be.smals.narcisisticNumber.exception.NarcisticNumberException;
import be.smals.narcisisticNumber.io.Writer;
import be.smals.narcisisticNumber.service.NarcisticNumberService;
import be.smals.narcisisticNumber.util.PrintUtil;

public class NarcisticNumberController {
    private final Writer writer;
    private final NarcisticNumberService narcisticNumberService;

    public NarcisticNumberController(Writer writer, NarcisticNumberService narcisticNumberService) {
        this.writer = writer;
        this.narcisticNumberService = narcisticNumberService;
    }

    public void isNarcisisticNumberAndPrint(int number) {
        try {
            boolean result = this.narcisticNumberService.isNarcisisticNumber(number);
            this.writer.printLine(PrintUtil.printIsNarcisticNumber(number, result));
        } catch (NarcisticNumberException e) {
            writer.printLine(e.getMessage());
        }
    }

    public void printNarcisisticRow(int limit) {
        try {
            this.writer.printLine(narcisticNumberService.calcNarcisisticRow(limit).toString());
        } catch (NarcisticNumberException e) {
            e.getMessage();
        }
    }
}
