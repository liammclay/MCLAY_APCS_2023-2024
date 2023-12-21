import java.util.Scanner;
public class UnethicalRPS {
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
        int num = (int)(Math.random()*3+1);
        
        System.out.print("rock, paper, or scissors?");
        String choice = scan.nextLine();
        choice = choice.toLowerCase();

        String rock = "rock";
        String scissors = "scissors";
        String paper = "paper";

        

        if (choice.equals(rock)){
            System.out.println("I choose "+paper);
        }
        else if (choice.equals(paper)){
            System.out.println("I choose "+scissors);
        }
        else if (choice.equals(scissors)){
            System.out.println("I choose "+rock);
        }

        System.out.println("I won");
       
    }
}
/*
 * took user imput and and printed out that the computer 
 * chose the thing that would win and then said i win 
 */

/*

1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments

*/