package be.smals.firstTest.io;

import java.io.PrintStream;

public abstract class Writer {
    abstract protected PrintStream getWriter();

    public void writeLine(String value){
        getWriter().println(value);
    }
}
