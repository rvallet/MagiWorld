package main.java.player;

import main.java.tools.ScannerTools;

/**
 * Class contenant les méthodes de résolution de combat
 * @see #playerAttack(Player, Player)
 */
public class FightResolve {

    /**
     * Méthode qui propose au joueur de choisir son action à lancer sur une cible
     *
     * @param launcher L'instance du joueur qui effectue l'action
     * @param target L'instace du joueur qui subit/reçoit l'action
     */
    public static void playerAttack(Player launcher, Player target) {
        /* Choix de l'attaque */
        String userInputAction;
        do {
            System.out.println(launcher.getName()+" ("+launcher.getLife()+" Vitalité)"+" veuillez choisir votre action (1 : Attaque Basique, 2 : Attaque Spéciale)");
            System.out.print("||"+launcher.getName()+"> ");
            userInputAction= ScannerTools.readLine();
        } while (!ScannerTools.isValidChoice(userInputAction,1,2));

        switch (userInputAction) {
            case "1":
                launcher.basicAttack(target);
                break;
            case "2":
                if (launcher.getProfession().equalsIgnoreCase("Guerrier")) {
                    launcher.specialAttack(target);
                } else {
                    launcher.specialAttack(launcher);
                }
                break;
            default:
                System.err.println("Ce choix n'est pas valide");
        }
    }
}
