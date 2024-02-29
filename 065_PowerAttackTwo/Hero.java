public class Hero {
    private String name;
    private int health;
    private int armor;
    private int strength;
    private String weapon;

    public Hero(String name, int health, int armor, int strength, String weapon){
        this.name = name;
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
        return "Haha, I've bested you!";
    }
    public String defeatMoan(){
        return "Ugh, I guess I lost. :(";
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
