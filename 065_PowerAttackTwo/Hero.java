public class Hero {
    private String name;
    private int health;
    private int armor;
    private int strength;
    private String weapon;

    public hero(String name, int health, int armor, int strength, String weapon){
        this.name = name;
        this.health = health;
        this. armor = armor;
        this.strength = strength;
        this.weapon = weapon;
    }

    public void attack(oppenant){
        
    }
    
    public int getAttack(){
        int attack = (int)(1+(Math.random() * 10))+ strength;
        return attack;
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
