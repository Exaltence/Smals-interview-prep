package be.smals.directoryPrint.service;

import be.smals.directoryPrint.exception.DirectoryException;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DirectoryServiceImpl implements DirectoryService {
    @Override
    public List<String> getFileStructure(String filePath) throws DirectoryException {

        File file = new File(filePath);

        if(!file.exists()) {
            throw new DirectoryException("File doesn't exist!");
        }

        List<String> structures = new ArrayList<>();
        getFileStructureOf(file, structures);

        return structures;
    }

    private void getFileStructureOf(File file, List<String> structures) {
        structures.add(file.getName());

        if(file.isDirectory()) {
            for(File nestedFile : file.listFiles()){
                getFileStructureOf(nestedFile,structures);
            }
         //   Arrays.stream(Objects.requireNonNull(file.listFiles())).forEach(nestedFile -> getFileStructureOf(nestedFile, structures));
        }
    }

}


