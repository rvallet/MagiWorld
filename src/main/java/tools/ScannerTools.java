package main.java.tools;

import java.util.Scanner;

public class ScannerTools {
    private static Scanner sc = new Scanner(System.in);

    public static String readLine() {
        return sc.nextLine();
    }

    /**
     * Méthode qui determine si le choix saisie par le joeur correspond aux choix proposé entre la valeur min et la valeur max
     * @param userInput
     * @param minChoice
     * @param maxChoice
     * @return True si la saisie correspond à l'intervalle
     */
    public static Boolean isValidChoice (String userInput, int minChoice, int maxChoice) {
        return userInput.length()== 1 ? userInput.matches("["+minChoice+"-"+maxChoice+"]*") : false;
    }

    /**
     * Méthode qui determine si le niveau saisie par le joeur est de 1 à 100
     * @param userInput
     * @return True Si la saisie correspond
     */
    public static Boolean isValidLevel (String userInput) {
        return Integer.parseInt(String.valueOf(userInput)) <= 100 && Integer.parseInt(String.valueOf(userInput)) > 0;
    }

    /**
     * Méthode qui determine si la saise ne contient que es chiffres
     * @param userInput
     * @return True si la la saisie ne contient que des chiffres
     */
    public static Boolean isNumber (String userInput) {
        return userInput.matches("[0-9]*");
    }
}
