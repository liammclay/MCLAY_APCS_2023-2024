import java.util.Scanner;
public class IsItLegalForYou {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("What is your age? ");
        int age = scan.nextInt();

        
         
         if (age >= 14){
            System.out.println("you can get a job");
        }
        else {
            System.out.println("you cannot get a job");
        }
        if (age >= 16){
            System.out.println("you can drive");
        }
        else {
            System.out.println("you cannot drive");
        }
        
         if (age >= 18){
            System.out.println("you can go to a casino");
        }
        else {
            System.out.println("you cannot go to a casino");
        }
        if (age >= 21){
            System.out.println("you can rent a car");
        }
        else {
            System.out.println("you cannot rent a car");
        } 
        if (age >= 21){
            System.out.println("you can buy alcohol");
        }
        else {
            System.out.println("you cannot buy alcohol");
        }
         if (age >= 21){
            System.out.println("you can buy cigs");
        }
        else {
            System.out.println("you cannot biy cigs");
        }
         if (age >= 35){
            System.out.println("you can run for president");
        }
        else {
            System.out.println("you cannot run for president");
        }
         if (age >= 65){
            System.out.println("you can enroll in medicare");
        }
        else {
            System.out.println("you cannot enroll in medicare");
        }
    }
}
/*
 * asked user for age.
 * used age in a series of if an else statments 
 * to let them know if they could or couldnt do stuff
 */

/*

1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments

*/