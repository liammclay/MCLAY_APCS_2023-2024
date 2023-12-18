import java.util.Scanner;
public class ShippingCalculator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("what is the weight of the package in pounds? ");
        double weight = scan.nextDouble();

        if (weight <= 0){
            System.out.println("Invalid input");
        }
         else if (weight > 0 && weight < 1){
            System.out.println("$3.50");
         }
         else if (weight > 1 && weight < 3){
            System.out.println("$5.50");
         }
         else if (weight > 3 && weight < 10){
            System.out.println("$8.50");
         }
         else if (weight > 10 && weight < 20){
            System.out.println("$3.50");
         }
         else if (weight > 20){
            System.out.println("This package canot be shipped");
         }
    }
    
}
/*
 * asked for weight. used it in a series of if statments that said if 
 * it was less than an greater 
 * than certain values it would return the right statement
 */

/*

1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments

*/