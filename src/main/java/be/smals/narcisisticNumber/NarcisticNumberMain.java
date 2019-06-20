package be.smals.narcisisticNumber;

import be.smals.narcisisticNumber.controller.NarcisticNumberController;
import be.smals.narcisisticNumber.io.ConsoleWriter;
import be.smals.narcisisticNumber.service.NarcisticNumberServiceImpl;

public class NarcisticNumberMain {
    public static void main(String[] args) {
        NarcisticNumberController narcisticNumberController = new NarcisticNumberController(new ConsoleWriter(), new NarcisticNumberServiceImpl());

        narcisticNumberController.isNarcisisticNumberAndPrint(153);
        narcisticNumberController.printNarcisisticRow(1000);
    }
}
