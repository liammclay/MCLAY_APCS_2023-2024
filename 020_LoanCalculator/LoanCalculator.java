import java.util.Scanner;

public class LoanCalculator 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("What is your principal balance? ");
        int pb = scan.nextInt();
        
        System.out.print("What is your annual interest rate? ");
        double air = scan.nextDouble();

        System.out.print("how many months are left on you loan plan? ");
        int months = scan.nextInt();

        double monthlyInterest = pb*(air/months);
        double monthlyPayment = pb/months+monthlyInterest;

        System.out.println("your monthly interest is "+monthlyInterest+".");
        System.out.println("your monthly payments are "+monthlyPayment+".");

    }
    
}
/*used scanner to have user input values
 * did the calculations with the variables i got from the user.
 * printed the results
 */

/*

1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments

*/