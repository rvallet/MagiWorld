package main.java.game;

import main.java.player.Player;
import main.java.player.Ranger;
import main.java.player.Warrior;
import main.java.player.Wizard;
import main.java.tools.ScannerTools;

public class LaunchMagiWorld {
    static int userStr=0;
    static int userAgi=0;
    static int userInt=0;


    public static void main(String[] args) {
        System.out.println("*** MagiWorld ***");
        System.out.println("Création du personnage du Joueur 1 :");

        /* Choix de la profession (classe) */
        String userInputClass;
        do {
            System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage)");
            System.out.print(" > ");
            userInputClass=ScannerTools.readLine();
        } while (!ScannerTools.isValidChoice(userInputClass));

        /* Choix du level */
        String userInputLevel;
        do {
            System.out.println("Niveau de votre personnage (1 à 100)");
            System.out.print(" > ");
            userInputLevel=ScannerTools.readLine();
        } while (!ScannerTools.isValidLevel(userInputLevel));
        int userLevel = Integer.parseInt(String.valueOf(userInputLevel));
        int leftPoints=userLevel;

        /* Force */
        String userInputStr;
        do {
            do {
                System.out.println("Force de votre personnage (0 à " + userLevel + ")\n" + "Il reste " + leftPoints + " points à répartir");

                System.out.print(" > ");
                userInputStr = ScannerTools.readLine();
            } while (!ScannerTools.isNumber(userInputStr));
            userStr = Integer.parseInt(String.valueOf(userInputStr));
        } while (userStr>leftPoints || !(leftPoints-userStr>=0));
        leftPoints-=userStr;

        /* Agilité */
        String userInputAgi;
        do {
            do {
                System.out.println("Agilité de votre personnage (0 à " + userLevel + ")\n" + "Il reste " + leftPoints + " points à répartir");
                System.out.print(" > ");
                userInputAgi = ScannerTools.readLine();
            } while (!ScannerTools.isNumber(userInputAgi));
            userAgi = Integer.parseInt(String.valueOf(userInputAgi));
        } while (userAgi>leftPoints || !(leftPoints-userAgi>=0));
        leftPoints-=userAgi;

        /* Intelligence */
        String userInputInt;
        do {
            do {
                System.out.println("Intelligence de votre personnage (0 à " + userLevel + ")\n" + "Il reste " + leftPoints + " points à répartir");
                System.out.print(" > ");
                userInputInt = ScannerTools.readLine();
            } while (!ScannerTools.isNumber(userInputInt));
            userInt = Integer.parseInt(String.valueOf(userInputInt));
        } while (userInt>leftPoints || !(leftPoints-userInt>=0));
        leftPoints-=userInt;

        /* Création du joueur */
        switch (userInputClass) {
            case "1":
                Player p1War = new Warrior("Joueur 1", userLevel, userStr, userAgi, userInt);
                break;
            case "2":
                Player p1Ran = new Ranger("Joueur 1", userLevel, userStr, userAgi, userInt);
                break;
            case"3":
                Player p1Wiz = new Wizard("Joueur 1", userLevel, userStr, userAgi, userInt);
                break;
            default:
                System.out.println("Choix erroné");
        }
    }
}
