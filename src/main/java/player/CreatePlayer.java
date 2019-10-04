package main.java.player;

import main.java.tools.ScannerTools;

public class CreatePlayer {

    public Player playerMaker (String name) {
        int userStr=0;
        int userAgi=0;
        int userInt=0;

        System.out.println("Création du personnage du "+name+" :");

        /* Choix de la profession (classe) */
        String userInputClass;
        do {
            System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage)");
            System.out.print("||"+name+"> ");
            userInputClass= ScannerTools.readLine();
        } while (!ScannerTools.isValidChoice(userInputClass,1,3));

        /* Choix du level */
        String userInputLevel;
        do {
            System.out.println("Niveau de votre personnage (1 à 100)");
            System.out.print("||"+name+"> ");
            userInputLevel=ScannerTools.readLine();
        } while (!ScannerTools.isValidLevel(userInputLevel));
        int userLevel = Integer.parseInt(String.valueOf(userInputLevel));
        int leftPoints=userLevel;

        /* Force */
        String userInputStr;
        do {
            do {
                System.out.println("Force de votre personnage (0 à " + userLevel + ")\n" + "Il reste " + leftPoints + " points à répartir");
                System.out.print("||"+name+"> ");
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
                System.out.print("||"+name+"> ");
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
                System.out.print("||"+name+"> ");
                userInputInt = ScannerTools.readLine();
            } while (!ScannerTools.isNumber(userInputInt));
            userInt = Integer.parseInt(String.valueOf(userInputInt));
        } while (userInt>leftPoints || !(leftPoints-userInt>=0));
        leftPoints-=userInt;

        /* Création du joueur */
        switch (userInputClass) {
            case "1":
                Player warrior = new Warrior(name, userLevel, userStr, userAgi, userInt);
                return warrior;
            case "2":
                Player ranger = new Ranger(name, userLevel, userStr, userAgi, userInt);
                return ranger;
            case"3":
                Player wizard = new Wizard(name, userLevel, userStr, userAgi, userInt);
                return wizard;
            default:
                System.err.println("Choix erroné");
                return null;
        }
    }
}
