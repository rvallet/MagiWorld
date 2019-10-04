package main.java.player;

import main.java.tools.ScannerTools;

public class CreatePlayer {

    public Player playerMaker (String playerName) {
        int userStr=0,userAgi=0,userInt=0;
        System.out.println("Création du personnage du "+playerName+" :");

        /* Choix de la profession (classe) */
        String userInputClass=playerClass(playerName);

        /* Choix du level */
        int userLevel = Integer.parseInt(String.valueOf(levelChoice(playerName)));
        int leftPoints=userLevel;

        /* Force */
        userStr=playerStat(playerName,"Force",userLevel,leftPoints);
        leftPoints-=userStr;

        /* Agilité */
        userAgi=playerStat(playerName,"Agilité",userLevel,leftPoints);
        leftPoints-=userAgi;

        /* Intelligence */
        userInt=playerStat(playerName,"Intelligence",userLevel,leftPoints);

        /* Création du joueur */
        switch (userInputClass) {
            case "1":
                Player warrior = new Warrior(playerName, userLevel, userStr, userAgi, userInt);
                return warrior;
            case "2":
                Player ranger = new Ranger(playerName, userLevel, userStr, userAgi, userInt);
                return ranger;
            case"3":
                Player wizard = new Wizard(playerName, userLevel, userStr, userAgi, userInt);
                return wizard;
            default:
                System.err.println("Choix erroné");
                return null;
        }
    }
    public String playerClass (String playerName) {
        String userInputClass;
        do {
            System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage)");
            System.out.print("||"+playerName+"> ");
            userInputClass= ScannerTools.readLine();
        } while (!ScannerTools.isValidChoice(userInputClass,1,3));
        return userInputClass;
    }

    public String levelChoice (String playerName) {
        String userInputLevel;
        do {
            System.out.println("Niveau de votre personnage (1 à 100)");
            System.out.print("||"+playerName+"> ");
            userInputLevel=ScannerTools.readLine();
        } while (!ScannerTools.isValidLevel(userInputLevel));
        return userInputLevel;
    }

    public int playerStat (String playerName, String statName, int userLevel, int leftPoints) {
        String userInput;
        int userStat;
        do {
            do {
                System.out.println(statName+" de votre personnage (0 à " + userLevel + ")\n" + "Il reste " + leftPoints + " points à répartir");
                System.out.print("||"+playerName+"> ");
                userInput = ScannerTools.readLine();
            } while (!ScannerTools.isNumber(userInput));
            userStat = Integer.parseInt(userInput);
        } while (userStat>leftPoints || !(leftPoints-userStat>=0));
        return userStat;
    }
}
