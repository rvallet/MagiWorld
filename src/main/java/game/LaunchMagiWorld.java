package main.java.game;

import main.java.player.*;

public class LaunchMagiWorld {

    public static void main(String[] args) {
        System.out.println("*** MagiWorld ***\n");

        /* Création des joueurs */
        Player p1 = new CreatePlayer().playerMaker("Joueur 1");
        Player p2 = new CreatePlayer().playerMaker("Joueur 2");

        /* Combats des joueurs */
        do {
            if (p1.getAlive())
            FightResolve.playerAttack(p1,p2);
            else System.out.println(p1.getName()+" est mort");
            if (p2.getAlive())
            FightResolve.playerAttack(p2,p1);
            else System.out.println(p2.getName()+" est mort");
        } while (!p1.getWon() && !p2.getWon());

        /* Annonce de la défaite */
        if (p1.getWon())
            System.out.println(p2.getName()+" a perdu !");
        else
            System.out.println(p1.getName()+" a perdu !");
    }
}