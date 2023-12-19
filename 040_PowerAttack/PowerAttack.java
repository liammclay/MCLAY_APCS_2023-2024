import java.util.Scanner;
public class PowerAttack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Your name is noah macn-something, and kai bodden is your arch nemesis.  To attack kai you use your weapon, your ability to annoy, and point out that kai doesnt have a lanyard to the teacher.  kai isn't that easy tho, he can bs and distract the teacher to a certain degree, so your attack won't always work.");

        int health = 13;
        int strength = 3;

        while(health >0){
            System.out.print("would you like to attack kai? ");
            String choice = scan.nextLine();

            if(choice.equals("yes") || choice.equals("attack")){
                int attackPower = (int)(Math.random()*10+1);
                int attack = attackPower+strength;

                System.out.println("you attack with a strength of "+attack);
                if(attack > 11){
                    int damage = (int)(Math.random()*3+1);
                    if(damage == 1){
                        damage = 4;
                    }
                    else if(damage == 2){
                        damage = 5;
                    }
                    else{
                        damage = 6;
                    }

                    System.out.println("you dealt "+damage+" damage.  The teacher is getting suspicious of kai.");
                    health = health - damage;
                }
                else{
                    System.out.println("your attack wasnt string enough, kai talks his way out of this one.");
                }
            }
            else{
                System.out.println("you should attack kai if you want to win, try again.");
            }
        }
        System.out.println("You did it, the teacher has sent kai to hutch.  Kai now has detention after school, but he'll get his revenge...");
    }
    
}
/*
 * made health and attack, made it so if the user attacked they would deal random damgae and if it was enough, theywould injure the enemy once the health hit zero they won
 */

/*

1/1 - Compiles
0/1 - Content
-I appreciate the creativity, but the purpose of this one was to loop until the monster was defeated.
This sort of attack pattern is going to be explored more in depth in the next version of power attack.
1/1 - Formatting
1/1 - Comments

*/