import java.util.Scanner;
public class DateTranslator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the day?(integer)");
        int day = scan.nextInt();
        System.out.println("What is the month?(integer)");
        int month = scan.nextInt();
        System.out.println("What is the year?(integer)");
        int year = scan.nextInt();
        scan.nextLine();
        System.out.println("Would you like the American or European style?(EU or USA)");
        String choice = scan.nextLine();

        if(choice.equals("EU")){
            printEuropean(day, month, year);
        }
        else if(choice.equals("USA")){
            printAmerican(day, month, year);
        }
        else{
            System.out.println("Please try again, and use a valid choice.");
        }
        
    }
    public static void printEuropean(int day, int month, int year) {
        System.out.println("The date is "+day+"/"+month+"/"+year+".");
    }
    public static void printAmerican(int day, int month, int year) {
        System.out.println("The date is "+month+"/"+day+"/"+year+".");

    }
}
//I made two methods, one for EU and for USA.  I prompted the user for the information, and chose the appropriete method based on the input.

/*

3/3 - Compile/Content
1/1 - Formatting
1/1 - Comments

*/