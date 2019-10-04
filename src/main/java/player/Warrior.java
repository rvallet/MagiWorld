package main.java.player;

public class Warrior extends Player {

    /* Class constructor*/
    public Warrior(String name, int level, int strength, int agility, int intelligence) {
        super(name, "Guerrier", "Coup d’Épée", "Coup de Rage", level, strength, agility, intelligence);
        System.err.println(this.toString());
    }

    /* Class methods*/
    public void basicAttack(Player player){
        System.out.println("\n"+this.getName()+ " utilise "+ this.getBasicAttack() +" et inflige "+ this.getStrength()+" dommages.");
        System.out.println(player.getName()+" perd "+ this.getStrength() +" points de vie.\n");
        player.setLife(player.getLife()- this.getStrength());
        if (player.getLife() <= 0) {
            player.setAlive(false);
            this.setWon(true);
        }
    }

    public void specialAttack(Player player){
        System.out.println("\n"+this.getName()+ " utilise "+ this.getSpecialAttack() +" et inflige "+ this.getStrength()*2 +" dommages.");
        System.out.println(player.getName()+" perd "+ this.getStrength()*2 +" points de vie.");
        System.out.println(this.getName()+" perd "+ this.getStrength()/2 +" points de vie.\n");
        player.setLife(player.getLife()- this.getStrength()*2);
        this.setLife(this.getLife() - (this.getStrength()/2));
        if (player.getLife() <= 0) {
            player.setAlive(false);
            this.setWon(true);
        }
    }

    /* toString */
    @Override
    public String toString() {
        return "\nWoarg !\n Je suis le " +getProfession()+" "+getName()+" niveau "+getLevel()+". Je possède "+getLife()+" de vitalité, "+getStrength()+" de force, "+getAgility()+" d'agilité et "+getIntelligence()+" d'intelligence !\n";
    }
}
