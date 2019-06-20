package be.smals.magicSquare.controller;

import be.smals.magicSquare.exception.MagicSquareException;
import be.smals.magicSquare.io.Printer;
import be.smals.magicSquare.service.MagicSquareService;
import be.smals.magicSquare.util.PrintUtil;

public class MagicSquareController {
    private final MagicSquareService magicSquareService;
    private final Printer printer;

    public MagicSquareController(MagicSquareService magicSquareService, Printer printer) {
        this.magicSquareService = magicSquareService;
        this.printer = printer;
    }

    public void calculateAndPrintMagicSquare(int rowsAndColumns){
        try{
            int[][] magicSquare = this.magicSquareService.generateSquare(rowsAndColumns);
            this.printer.printLine(PrintUtil.printMagicSquare(magicSquare));
        }catch(MagicSquareException e){
            this.printer.printLine(e.getMessage());
        }
    }
}
