package main.java.game;

import main.java.player.Player;
import main.java.player.Ranger;
import main.java.player.Warrior;
import main.java.player.Wizard;
import main.java.tools.ScannerTools;

public class LaunchMagiWorld {

    public static void main(String[] args) {
        System.out.println("*** MagiWorld ***");

        System.out.println("Création du personnage du Joueur 1 :");
        String userInputClass;
        do {
            System.out.println("Veuillez choisir la classe de vore personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage)");
            System.out.print(" > ");
            userInputClass=ScannerTools.readLine();
        } while (!ScannerTools.isValidChoice(userInputClass));

        switch (userInputClass) {
            case "1":
                Player p1 = new Warrior("Joueur 1", 10, 10, 0, 0);
                break;
            case "2":
                Player p2 = new Ranger("Joueur 2", 10, 0, 10, 0);
                break;
            case"3":
                Player p3 = new Wizard("Joueur 3", 10, 0, 0, 10);
                break;
            default:
                System.out.println("Choix erroné");
        }

        /* Tests : START */
/*        Player p1 = new Warrior("Joueur 1", 10, 10, 0, 0);
        Player p2 = new Ranger("Joueur 2", 10, 0, 10, 0);
        Player p3 = new Wizard("Joueur 3", 10, 0, 0, 10);

        p1.basicAttack(p2);
        p2.basicAttack(p1);
        p3.basicAttack(p3);

        p1.specialAttack(p2);
        p2.specialAttack(p2);
        p2.basicAttack(p1);
        p3.specialAttack(p3);*/
        /* Tests : END */
    }
}
