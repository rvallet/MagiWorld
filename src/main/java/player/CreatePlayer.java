package main.java.player;

import main.java.tools.ScannerTools;

/**
 * Class contenant les méthodes nécéssaires à la création d'un joueur
 * @see #playerMaker(String)
 */
public class CreatePlayer {

    /**
     *  Méthode qui invite le joeur à choisir sont personnage et qui retourne une instance de ce choix
     * @param playerName Le nom du joueur
     * @return Player une instance d'une des class qui étends Player (choix du joueur)
     * 
     * @see #playerClass(String) 
     * @see #levelChoice(String) 
     * @see #playerStat(String, String, int, int) 
     * @see #instanceMaker(String, String, int, int, int, int) 
     */
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
        return instanceMaker(userInputClass,playerName, userLevel, userStr, userAgi, userInt);
    }


    /**
     * Méthode qui invite le joeur à choisir sa profession (classe) et qui retourne le choix effectué
     *
     * @param playerName Le nom du joueur
     * @return String La valeur texte du choix de la profession du joueur (1, 2 ou 3)
     */
    public String playerClass (String playerName) {
        String userInputClass;
        do {
            System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage)");
            System.out.print("||"+playerName+"> ");
            userInputClass= ScannerTools.readLine();
        } while (!ScannerTools.isValidChoice(userInputClass,1,3));
        return userInputClass;
    }

    /**
     * Méthode qui invite le joeur à choisir son niveau et qui retourne le choix effectué
     *
     * @param playerName Le nom du joueur
     * @return String La valeur texte du niveau du joueur (1 à 100)
     */
    public String levelChoice (String playerName) {
        String userInputLevel;
        do {
            System.out.println("Niveau de votre personnage (1 à 100)");
            System.out.print("||"+playerName+"> ");
            userInputLevel=ScannerTools.readLine();
        } while (!ScannerTools.isValidLevel(userInputLevel));
        return userInputLevel;
    }

    /**
     * Méthode qui invite le joeur à choisir le nombre de points à mettre dans une stats et qui retoune la valeur du choix effectué
     * @param playerName Le nom du joeur
     * @param statName Le nom de la caractéristique
     * @param userLevel Le niveau du joueur
     * @param leftPoints Le nombre de point restant à distribuer dans les caractéritiques
     * @return int la valeur du nombre de point pour cette caractéritique
     */
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

    /**
     * Méthode qui retourne une instance du joueur selon le choix effectuer à l'entrée clavier
     * @param userInputClass L'entrée clavier du joeur (le choix de la profession)
     * @param playerName Le nom du joeur
     * @param userLevel le niveau du joeur
     * @param userStr La force du joeur
     * @param userAgi L'agilité du joeur
     * @param userInt L'intelligence du joeur
     * @return Player une instance de la profession choisis par le joeur
     */
    public Player instanceMaker (String userInputClass, String playerName, int userLevel, int userStr, int userAgi, int userInt) {
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
}
