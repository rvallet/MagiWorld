package main.java.player;

import main.java.tools.ScannerTools;

public class FightResolve {

    public static void playerAttack(Player attacking, Player attacked) {
        /* Choix de l'attaque */
        String userInputAction;
        do {
            System.out.println(attacking.getName()+" ("+attacking.getLife()+" Vitalité)"+" veuillez choisir votre action (1 : Attaque Basique, 2 : Attaque Spéciale)");
            System.out.print("||"+attacking.getName()+"> ");
            userInputAction= ScannerTools.readLine();
        } while (!ScannerTools.isValidChoice(userInputAction,1,2));

        switch (userInputAction) {
            case "1":
                attacking.basicAttack(attacked);
                break;
            case "2":
                if (attacking.getProfession().equalsIgnoreCase("Guerrier")) {
                    attacking.specialAttack(attacked);
                } else {
                    attacking.specialAttack(attacking);
                }
                break;
            default:
                System.err.println("Ce choix n'est pas valide");
        }
    }
}
