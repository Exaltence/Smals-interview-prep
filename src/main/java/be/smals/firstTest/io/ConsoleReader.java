package be.smals.firstTest.io;

import java.io.InputStream;

public class ConsoleReader extends Reader {
    private InputStream reader;

    public ConsoleReader(){
        this.reader = System.in;
    }

    @Override
    protected InputStream getReader() {
        return reader;
    }
}
