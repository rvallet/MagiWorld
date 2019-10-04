package main.java.tools;

import java.util.Scanner;

public class ScannerTools {
    private static Scanner sc = new Scanner(System.in);

    public static String readLine() {
        return sc.nextLine();
    }

    public static Boolean isValidChoice (String userInput, int minChoice, int maxChoice) {
        return userInput.length()== 1 ? userInput.matches("["+minChoice+"-"+maxChoice+"]*") : false;
    }

    public static Boolean isValidLevel (String userInput) {
        return Integer.parseInt(String.valueOf(userInput)) <= 100 && Integer.parseInt(String.valueOf(userInput)) > 0;
    }

    public static Boolean isNumber (String userInput) {
        return userInput.matches("[0-9]*");
    }
}
