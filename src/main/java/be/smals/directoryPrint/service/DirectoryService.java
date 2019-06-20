package be.smals.directoryPrint.service;

import be.smals.directoryPrint.exception.DirectoryException;

import java.util.List;

public interface DirectoryService {
    List<String> getFileStructure(String filePath) throws DirectoryException;
}
