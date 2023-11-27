import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("What integer would you like me to count up to? ");
        int num = scan.nextInt();

        int count = 0;

        while(count <= num){
            System.out.println(count);
            count++;
        }
    }
}
/*
 * ask for input
 * run a while loop where i print zero han add one until it equals the input
 */