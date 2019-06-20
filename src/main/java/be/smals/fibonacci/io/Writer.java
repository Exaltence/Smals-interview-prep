package be.smals.fibonacci.io;

import java.io.PrintStream;

public abstract class Writer {
    protected abstract PrintStream getWriter();

    public void printLine(String value){
         getWriter().println(value);
    }
}
