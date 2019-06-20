package be.smals.fibonacci.io;

import java.io.InputStream;
import java.util.Scanner;

public abstract class Reader {
    protected abstract InputStream getReader();

    public String readLine(){
        try(Scanner scanner = new Scanner(getReader())){
            return scanner.nextLine();
        }
    }
}
