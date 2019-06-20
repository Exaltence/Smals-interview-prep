package be.smals.directoryPrint.controller;

import be.smals.directoryPrint.exception.DirectoryException;
import be.smals.directoryPrint.io.Printer;
import be.smals.directoryPrint.service.DirectoryService;

import java.util.List;

public class FileController {

    private final DirectoryService directoryService;
    private final Printer printer;

    public FileController(DirectoryService directoryService, Printer printer) {
        this.directoryService = directoryService;
        this.printer = printer;
    }

    public void printDirectoryFileStructure(String filePath) {
        try {
            List<String> structures = this.directoryService.getFileStructure(filePath);
            structures.forEach(this.printer::printLine);
            // this.printer.printLine(PrintUtil.printDirectoryStructure(structures));
        } catch (DirectoryException e) {
            this.printer.printLine(e.getMessage());
        }
    }
}
