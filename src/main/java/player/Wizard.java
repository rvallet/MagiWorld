package main.java.player;

public class Wizard extends Player {

    /* Class constructor*/
    public Wizard(String name, int level, int strength, int agility, int intelligence) {
        super(name, "Mage", level, strength, agility, intelligence);
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
        return "\nAbracadabra !\n Je suis le " +getProfession()+" "+getName()+" niveau "+getLevel()+". Je possède "+getLife()+" de vitalité, "+getStrength()+" de force, "+getAgility()+" d'agilité et "+getIntelligence()+" d'intelligence !\n";
    }
}
