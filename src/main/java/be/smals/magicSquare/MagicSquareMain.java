package be.smals.magicSquare;

import be.smals.magicSquare.controller.MagicSquareController;
import be.smals.magicSquare.io.ConsolePrinter;
import be.smals.magicSquare.service.MagicSquareServiceImpl;

public class MagicSquareMain {
    public static void main(String[] args) {
        MagicSquareController magicSquareController = new MagicSquareController(new MagicSquareServiceImpl(), new ConsolePrinter());
        magicSquareController.calculateAndPrintMagicSquare(3);
    }
}
