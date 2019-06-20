package be.smals.magicSquare.io;

import java.util.Scanner;

public class ConsoleReader implements Reader {
    @Override
    public String readLine(String message) {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
