package main.java.game;

import main.java.player.*;
import main.java.tools.ScannerTools;

public class LaunchMagiWorld {

    public static void main(String[] args) {
        System.out.println("*** MagiWorld ***");

        /* Création des joueurs */
        Player p1 = new CreatePlayer().playerMaker("Joueur 1");
        Player p2 = new CreatePlayer().playerMaker("Joueur 2");

        /* Combats des joueurs */

        /* Choix de l'attaque */
        String userInputAction;
        do {
            System.out.println(p1.getName()+" ("+p1.getLife()+" Vitalité)"+" veuillez choisir votre action (1 : Attaque Basique, 2 : Attaque Spéciale");
            System.out.print(p1.getName()+" > ");
            userInputAction= ScannerTools.readLine();
        } while (!ScannerTools.isValidChoice(userInputAction,1,2));

        switch (userInputAction) {
            case "1":
                p1.basicAttack(p2);
                break;
            case "2":
                if (p1.getProfession().equalsIgnoreCase("Guerrier")) {
                    p1.specialAttack(p2);
                } else {
                    p1.specialAttack(p1);
                }
                break;
            default:
                System.err.println("Ce choix n'est pas valide");
        }
    }
}
