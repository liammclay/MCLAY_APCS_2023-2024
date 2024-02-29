public class Monster {
    private String name;
    private String species;
    private int health;
    private int armor;
    private int strength;
    private String weapon;

    public Monster(String name, String species, int health, int armor, int strength, String weapon){
        this.name = name;
        this.species = species;
        this.health = health;
        this. armor = armor;
        this.strength = strength;
        this.weapon = weapon;
    }

    
    public int getAttack(){
        int attack = (int)(1+(Math.random() * 10))+ strength;
        return attack;
    }
    public String victoryCheer(){
        return "Mwahaha, time to DIE!";
    }
    public String defeatMoan(){
        return "NOOOOOOO, I'll get you next time.";
    }

    public int getHealth(){
        return health;
    }
    public int getArmor(){
        return attack;
    }
    public int getStrength(){
        return strength;
    }
    public void setHealth(int newHealth){
        this.health = newHealth;
    }
    
}