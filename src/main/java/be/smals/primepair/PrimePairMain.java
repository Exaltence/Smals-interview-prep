package be.smals.primepair;

import be.smals.primepair.controller.PrimePairMainController;
import be.smals.primepair.io.ConsolePrinter;
import be.smals.primepair.service.PrimePairServiceImpl;

public class PrimePairMain {
    public static void main(String[] args) {
        PrimePairMainController primePairMainController = new PrimePairMainController(new PrimePairServiceImpl(), new ConsolePrinter());
        primePairMainController.calculateAndPrintPrimePairs(100);
    }
}
