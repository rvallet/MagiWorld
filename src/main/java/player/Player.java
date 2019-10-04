package main.java.player;

public abstract class Player {
    /* Abstract class variables */
    protected String name;
    protected String profession;
    protected String basicAttack;
    protected String specialAttack;
    protected int level;
    protected int life;
    protected int strength;
    protected int agility;
    protected int intelligence;
    protected Boolean isAlive;
    protected Boolean isWon;

    /* Abstract class constructor*/
    public Player (String name, String profession, String basicAttack, String specialAttack, int level, int strength, int agility, int intelligence){
        this.name=name;
        this.profession=profession;
        this.basicAttack=basicAttack;
        this.specialAttack=specialAttack;
        setStrength(strength);
        setAgility(agility);
        setIntelligence(intelligence);
        setLevel(level);
        setLife(this.getLevel()*5);
        setAlive(true);
        setWon(false);
    }

    /**
     * Méthode qui détermine le comportement de l'attaque basique du joueur.
     * Le comportement varie suivant l'instance du joeur passé en paramètre de cette méthode
     * @param player L'instance du joueur
     */
    /* Class methods*/
    public void basicAttack(Player player){}

    /**
     * Méthode qui détermine le comportement de l'attaque spéciale du joueur.
     * Le comportement varie suivant l'instance du joeur passé en paramètre de cette méthode
     * @param player L'instance du joueur
     */
    public void specialAttack(Player player){}

    /* toString */
    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", profession='" + profession + '\'' +
                ", level=" + level +
                ", life=" + life +
                ", strength=" + strength +
                ", agility=" + agility +
                ", intelligence=" + intelligence +
                ", isAlive=" + isAlive +
                ", isWon=" + isWon +
                '}';
    }

    /* Abstract class getters & setters*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getBasicAttack() {
        return basicAttack;
    }

    public void setBasicAttack(String basicAttack) {
        this.basicAttack = basicAttack;
    }

    public String getSpecialAttack() {
        return specialAttack;
    }

    public void setSpecialAttack(String specialAttack) {
        this.specialAttack = specialAttack;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public Boolean getAlive() {
        return isAlive;
    }

    public void setAlive(Boolean alive) {
        isAlive = alive;
    }

    public Boolean getWon() {
        return isWon;
    }

    public void setWon(Boolean won) {
        isWon = won;
    }
}
