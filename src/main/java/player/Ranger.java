package main.java.player;

public class Ranger extends Player {

    /* Class constructor*/
    public Ranger(String name, int level, int strength, int agility, int intelligence) {
        super(name, "Rôdeur", "Tir à l’Arc", "Concentration", level, strength, agility, intelligence);
        System.out.println(this.toString());
    }

    /* Class methods*/
    public void basicAttack(Player player){
        System.out.println(this.getName()+ " utilise "+ this.getBasicAttack() +" et inflige "+ this.getAgility()+" dommages.");
        System.out.println(player.getName()+" perd "+ this.getAgility() +" points de vie.\n");
        player.setLife(player.getLife()- this.getAgility());
        if (player.getLife() <= 0) {
            player.setAlive(false);
            this.setWon(true);
        }
    }

    public void specialAttack(Player player){
        System.out.println(this.getName()+ " utilise "+ this.getSpecialAttack() +" et gagne "+ this.getLevel()/2+" points d'agilité.\n");
        this.setAgility(this.getAgility()+ (this.getLevel()/2));
    }

    /* toString */
    @Override
    public String toString() {
        return "\nLeading the way !\n Je suis le " +getProfession()+" "+getName()+" niveau "+getLevel()+". Je possède "+getLife()+" de vitalité, "+getStrength()+" de force, "+getAgility()+" d'agilité et "+getIntelligence()+" d'intelligence !\n";
    }
}
