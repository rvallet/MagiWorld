package main.java.player;

public class Wizard extends Player {

    /* Class constructor*/
    public Wizard(String name, int level, int strength, int agility, int intelligence) {
        super(name, "Mage", "Boule de Feu","Soin",level, strength, agility, intelligence);
        System.out.println(this.toString());
    }

    /* Class methods*/
    public void basicAttack(Player player){
        System.out.println(this.getName()+ " utilise "+ this.getBasicAttack() +" et inflige "+ this.getIntelligence()+" dommages.");
        System.out.println(player.getName()+" perd "+ this.getIntelligence() +" points de vie.\n");
        player.setLife(player.getLife()- this.getIntelligence());
        if (player.getLife() <= 0) {
            player.setAlive(false);
            this.setWon(true);
        }
    }

    public void specialAttack(Player player){
        int heal = (player.getLife() + this.getIntelligence()*2) > player.getLevel()*5 ? (player.getLevel()*5 - player.getLife()) : this.getIntelligence()*2;
        System.out.println(this.getName()+ " utilise "+ this.getSpecialAttack() +", "+player.getName()+ " gagne "+ heal+" en vitalité.\n");
        player.setLife(this.getLife()+heal);
    }

    /* toString */
    @Override
    public String toString() {
        return "\nAbracadabra !\n Je suis le " +getProfession()+" "+getName()+" niveau "+getLevel()+". Je possède "+getLife()+" de vitalité, "+getStrength()+" de force, "+getAgility()+" d'agilité et "+getIntelligence()+" d'intelligence !\n";
    }
}
