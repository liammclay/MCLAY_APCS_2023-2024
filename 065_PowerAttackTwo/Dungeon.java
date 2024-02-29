public class Dungeon {
    public static void main(String[] args) {
        Hero hero = new Hero("Ronald McDonald", 10000, 6, 99, "Grimace Shake");
        Monster monster = new Monster("Darth Maul", "Dathomirian", 300, 2, 40, "Double-Bladed Lightsaber");

        System.out.println(hero.name()+" attacks "+monster.name()+" by poisening him with a"+hero.weapon()+".");

        System.out.println(monster.name()+" attacks "+hero.name()+" by poisening him with a"+monster.weapon()+".");
    }
}
