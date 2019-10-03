package main.java.player;

public class Ranger extends Player {

    /* Class constructor*/
    public Ranger(String name, int level, int strength, int agility, int intelligence) {
        super(name, "Rôdeur", level, strength, agility, intelligence);
        System.out.println(this.toString());
    }

    /* Class methods*/
    public void basicAttack(){

    };
    public void specialAttack(){

    };

    /* toString */
    @Override
    public String toString() {
        return "\nLeading the way !\n Je suis le " +getProfession()+" "+getName()+" niveau "+getLevel()+". Je possède "+getLife()+" de vitalité, "+getStrength()+" de force, "+getAgility()+" d'agilité et "+getIntelligence()+" d'intelligence !\n";
    }
}
