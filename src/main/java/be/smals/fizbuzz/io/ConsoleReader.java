package be.smals.fizbuzz.io;

import java.util.Scanner;

public class ConsoleReader implements Reader {
    @Override
    public String readLine() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
