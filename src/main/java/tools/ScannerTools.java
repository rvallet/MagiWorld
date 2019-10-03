package main.java.tools;

import java.util.Scanner;

public class ScannerTools {
    private static Scanner sc = new Scanner(System.in);

    public static String readLine() {
        return sc.nextLine();
    }

    public static Boolean isValidChoice (String userInput) {
        return userInput.length()== 1 ? userInput.matches("[1-3]*") : false;
    }

    public static Boolean isValidLevel (String userInput) {
        return Integer.parseInt(String.valueOf(userInput)) <= 100 && Integer.parseInt(String.valueOf(userInput)) > 0;
    }
}
