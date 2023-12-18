
import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("what is the integer? ");
        int num = scan.nextInt();

        int value = num%2;
        
        if(value == 0){
            System.out.println(num+" is even.");
        }
        else{
            System.out.println(num+" is odd.");
        }
    }
}
/*
 * asked for integer
 * used modulo two to get a remainder of 1 or zero, wich means even or odd
 */

/*

1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments

*/