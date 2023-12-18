import java.util.Scanner;
public class RPSOne {
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
        int num = (int)(Math.random()*3+1);
        
        System.out.print("rock, paper, or scissors?");
        String choice = scan.nextLine();
        choice = choice.toLowerCase();

        String rock = "rock";
        String scissors = "scissors";
        String paper = "paper";

        String compChoice = "";

        //computer choice
        if (num == 1){
            compChoice = "rock";
            System.out.println("I choose "+compChoice);
        }
        else if (num == 2){
            compChoice = "paper";
            System.out.println("I choose "+compChoice);
        }
        else if (num == 3){
            compChoice = "scissors";
            System.out.println("I choose "+compChoice);
        }
        

        //if user chose rock
        if (choice.equals(rock) && compChoice.equals(rock)){
            System.out.println("we tied");
        }
        else if (choice.equals(rock) && compChoice.equals(scissors)){
            System.out.println("you won");
        }
        else if (choice.equals(rock) && compChoice.equals(paper)){
            System.out.println("I won");
        }
        

        //if user chose paper
        if (choice.equals(paper) && compChoice.equals(rock)){
            System.out.println("you won");
        }
        else if (choice.equals(paper) && compChoice.equals(scissors)){
            System.out.println("I won");
        }
        else if (choice.equals(paper) && compChoice.equals(paper)){
            System.out.println("we tied");
        }
        

        //if user chose scissors
        if (choice.equals(scissors) && compChoice.equals(rock)){
            System.out.println("I won");
        }
        else if (choice.equals(scissors) && compChoice.equals(scissors)){
            System.out.println("we tied");
        }
        else if (choice.equals(scissors) && compChoice.equals(paper)){
            System.out.println("you won");
        }
  
        

       
    }
}
/*
 * took users choice, made computer choice, 
 * then compared tham and said who one
 */

 /*

1/1 - Compiles
1/1 - Content
0/1 - Formatting
1/1 - Comments

*/