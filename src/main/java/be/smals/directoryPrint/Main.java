package be.smals.directoryPrint;

import be.smals.directoryPrint.controller.FileController;
import be.smals.directoryPrint.io.ConsolePrinter;
import be.smals.directoryPrint.service.DirectoryServiceImpl;


public class Main {
    public static void main(String[] args) {
        FileController fileController = new FileController(new DirectoryServiceImpl(), new ConsolePrinter());
        fileController.printDirectoryFileStructure("C:\\eru-illuvatar");
    }
}

