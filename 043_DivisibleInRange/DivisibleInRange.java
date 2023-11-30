import java.util.Scanner;
public class DivisibleInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a range of numbers and a number you would like them to be divisible by.");
        System.out.print("What is the bottom of the range of numbers?(integer): ");
        int min = scan.nextInt();
        System.out.print("What is the top of the range of numbers?(integer): ");
        int max = scan.nextInt();
        System.out.print("What would you like them to be divisible by?(integer): ");
        int divide = scan.nextInt();

        System.out.println("These are the numbers between "+min+" and "+max+" that are divisible by "+divide);
        while(min <= max){
            if(min%divide == 0){
                System.out.println(min);
                min++;
            }
            else{
                min++;
            }
        }
    }
}
/*took the range and the divisible number.
 * used a while loop to keep checking if the numbers were divisible or not and printing the ones tha are
 */