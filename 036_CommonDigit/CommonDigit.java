import java.util.Scanner;
public class CommonDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("enter two integers between 25 and 75");
        System.out.print("first integer? ");
        int num1 = scan.nextInt();
        System.out.print("second integer? ");
        int num2 = scan.nextInt();
        
        if (num1<25 || num1>75 || num2<25 || num2>75){
            System.out.println("invalid input.");
        }
        else if(num1>25 || num1<75 || num2>25 || num2<75){
            int num1SlotTwo = (num1%10);
            int num1SlotOne = (num1-num1SlotTwo)/10;
            int num2SlotTwo = (num2%10);
            int num2SlotOne = (num2-num2SlotTwo)/10;
            if (num1SlotOne == num2SlotOne || num1SlotOne == num2SlotTwo){
                System.out.println("there is a matching "+num1SlotOne);
            }
            else if (num1SlotTwo == num2SlotOne || num1SlotTwo == num2SlotTwo){
                System.out.println("there is a matching "+num1SlotTwo);
            }
            else{
                System.out.println("no numbers match.");
            }
        }
    }
}

/*

1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments

*/