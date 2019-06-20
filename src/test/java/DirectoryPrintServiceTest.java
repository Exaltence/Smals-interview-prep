import be.smals.directoryPrint.exception.DirectoryException;
import be.smals.directoryPrint.service.DirectoryServiceImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertNotNull;

public class DirectoryPrintServiceTest {
    private DirectoryServiceImpl directoryService;

    @Before
    public void setUp() {
        directoryService = new DirectoryServiceImpl();
    }

    @Test
    public void returnsDirectoryAndFiles(){
        List<String> directoriesAndFiles = new ArrayList<>();
        try {
            directoriesAndFiles = directoryService.getFileStructure("C:\\eru-illuvatar");
        } catch (DirectoryException e) {
            e.printStackTrace();
        }
        assertNotNull(directoriesAndFiles);
    }

    @Test
    public void returnsException(){
        List<String> directoriesAndFiles = new ArrayList<>();
        try {
            directoriesAndFiles = directoryService.getFileStructure("C:\\doesNotExist");
        } catch (DirectoryException e) {
            e.printStackTrace();
        }
        assertNotNull(directoriesAndFiles);
    }

}
