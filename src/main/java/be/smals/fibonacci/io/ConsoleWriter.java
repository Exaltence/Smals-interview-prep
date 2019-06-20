package be.smals.fibonacci.io;

import java.io.PrintStream;

public class ConsoleWriter extends Writer {
    private PrintStream writer;

    public ConsoleWriter(){
        this.writer = System.out;
    }

    @Override
    protected PrintStream getWriter() {
        return writer;
    }
}
