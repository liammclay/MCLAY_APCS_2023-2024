import java.util.Scanner;

public class PrintYourName {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("What is your first name?: ");
        String fname = scan.nextLine();

        System.out.print("What is your last name?: ");
        String lname = scan.nextLine();

        System.out.println("Your full name is "+fname+" "+lname);

    }
    
}
/*imported scanner
 * asked name and scanned next line
 * printed out string with name
 */