import java.util.Scanner;
import java.util.ArrayList;

public class AverageDiceRolls {
    public ArrayList<Integer> memory = new ArrayList<Integer>();
    public int sides;
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Boolean keepGoing = true;
        
        System.out.println("How many sides do you want your dice to have?");
        sides = scan.nextInt();

        
        
        while(keepGoing = true){
            System.out.println("Would you like to roll the dice?(yes or no)");
            String response = scan.nextLine();

            if(response.equals("yes")){
                output();
            }
            else{
                keepGoing = false;
            }
        }

    }
    public void output(){
        Dice dice = new Dice(sides);
        int roll = dice.roll();
        System.out.println("you rolled a"+roll);
        memory.add(roll);
        average(memory);
    }
    public float average(int[] arr){
        int num = 0;
        for(int i = 0; i<= memory.size(); i++){
            num+=memory.get(i);
        }
        float average = num/memory.size();
        return average;
    }
}
