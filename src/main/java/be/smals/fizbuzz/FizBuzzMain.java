package be.smals.fizbuzz;

import be.smals.fizbuzz.controller.FizBuzzController;
import be.smals.fizbuzz.io.ConsolePrinter;
import be.smals.fizbuzz.io.ConsoleReader;
import be.smals.fizbuzz.io.Printer;
import be.smals.fizbuzz.io.Reader;
import be.smals.fizbuzz.service.FizBuzzServiceImpl;

public class FizBuzzMain {

    private static final Reader reader = new ConsoleReader();
    private static final Printer printer = new ConsolePrinter();

    public static void main(String[] args) {
        FizBuzzController fizzBuzzController = new FizBuzzController(new FizBuzzServiceImpl(),new ConsolePrinter());

        printer.printLine("Please enter a number: ");
        String input = reader.readLine();

        fizzBuzzController.checkAndPrintFizzBuzz(input);
    }

}
