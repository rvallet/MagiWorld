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
        System.out.println(p1.getName()+" ("+p1.getLife()+" Vitalité)"+" veuillez choisir votre action (1 : Attaque Basique, 2 : Attaque Spéciale");
        
    }
}
