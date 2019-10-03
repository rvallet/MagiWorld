package main.java.game;

import main.java.player.Player;
import main.java.player.Ranger;
import main.java.player.Warrior;
import main.java.player.Wizard;

public class LaunchMagiWorld {

    public static void main(String[] args) {
        System.out.println("*** Starting DEV ***");
        Player playerOne = new Wizard("Joueur 1", 10, 0, 0, 10);
        Player playerTwo = new Warrior("Joueur 1", 10, 10, 0, 0);
        Player playerThree = new Ranger("Joueur 1", 10, 0, 10, 0);

    }
}
