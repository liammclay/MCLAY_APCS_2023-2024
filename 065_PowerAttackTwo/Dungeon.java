public class Dungeon {
    public static void main(String[] args) {
        Hero hero = new Hero("Ronald McDonald", 10000, 6, 99, "Grimace Shake");
        Monster monster = new Monster("Darth Maul", "Dathomirian", 300, 2, 40, "Double-Bladed Lightsaber");

        System.out.println(hero.name()+" attacks "+monster.name()+" by poisening him with a"+hero.weapon()+".");

        System.out.println(monster.name()+" attacks "+hero.name()+" by poisening him with a"+monster.weapon()+".");

        while(hero.health() <= 0 || monster.health() <= 0){
            int heroAttack = hero.getAttack()-monster.getArmor();
            monster.setHealth(monster.getHealth()-heroAttack);
            System.out.println(hero.name+" attacks "+monster.name+" by poisening him with a"+hero.weapon+".  He deals "+heroAttack+" damage.  "+monster.name+" has "+monster.getHealth()+" health left.");

            int monsterAttack = monster.getAttack()-hero.getArmor();
            hero.setHealth(hero.getHealth()-monsterAttack);
            System.out.println(moster.name+" attacks "+hero.name+" slashing him with his "+moster.weapon+".  He deals "+monsterAttack+" damage.  "+hero.name+" has "+hero.getHealth()+" health left.");
        }

        if(hero.getHealth() > 0){
            System.out.println(hero.victoryCheer());
            System.out.println(monster.defeatMoan());
        }
        else if(monster.getHealth() > 0 ){
            System.out.println(monster.victoryCheer());
            System.out.println(hero.defeatMoan());
        }
    }
}


/*

0/3 - Compile/Content
-On track, but not quite there. Doesn't compile, isn't all the way finished. Good start though.
1/1 - Formatting
1/1 - Comments

*/