package be.smals.firstTest.io;

import java.io.InputStream;
import java.util.Scanner;

public abstract class Reader {
    abstract protected InputStream getReader();

    public String readLine(){
        try(Scanner scanner = new Scanner(getReader())){
            return scanner.nextLine();
        }
    }
}
