import java.util.Scanner;
import java.util.ArrayList;

public class AverageDiceRolls {
    public ArrayList<Integer> memory = new ArrayList<Integer>();
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Boolean keepGoing = true;

        AverageDiceRolls foo = new AverageDiceRolls(); 
        
        System.out.println("How many sides do you want your dice to have?");
        int sides = scan.nextInt();
        scan.nextLine();

        
        
        while(keepGoing == true){
            System.out.println("Would you like to roll the dice?(yes or no)");
            String response = scan.nextLine();

            if(response.equals("yes")){
                foo.output(sides);
            }
            else{
                keepGoing = false;
            }
        }

    }
    public void output(int sides){
        Dice dice = new Dice(sides);
        int curentRoll = dice.roll();
        System.out.println("you rolled a "+curentRoll);
        memory.add(curentRoll);
        System.out.println("You're average is "+average(memory));
    }
    public float average(ArrayList<Integer> arr){
        int num = 0;
        for(int i = 0; i< arr.size(); i++){
            num+=arr.get(i);
        }
        float average = num/arr.size();
        return average;
    }
}
// used a while loop to keep asking to roll dice, and used methods outside of main to 
// access dice class to roll dice, and to find the average.

/*

3/3 - Compile/Content
1/1 - Formatting
1/1 - Comments

Late - 1

*/