package be.smals.primepair.controller;

import be.smals.primepair.util.PrintUtil;
import be.smals.primepair.exception.PrimePairException;
import be.smals.primepair.io.Printer;
import be.smals.primepair.service.PrimePairService;

import java.util.List;

public class PrimePairMainController {
    private final PrimePairService primePairService;
    private final Printer printer;

    public PrimePairMainController(PrimePairService primePairService, Printer printer) {
        this.primePairService = primePairService;
        this.printer = printer;
    }

    public void calculateAndPrintPrimePairs(int highestNumber){
        try{
            List<String> result = this.primePairService.calculatePrimePair(highestNumber);
            this.printer.printLine(PrintUtil.printResult(result));
        }catch(PrimePairException e){
            this.printer.printLine(e.getMessage());
        }
    }
}
