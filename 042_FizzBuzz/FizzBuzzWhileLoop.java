import java.util.Scanner;
public class FizzBuzzWhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("FizzBuzz; we take turns counting up from one.  for numbers divisible by 3 you say Fizz, if they are divisible by 5 you say Buzz, if they are divisible by both say Fizbuzz. how high do you want me to go?");
        int num = scan.nextInt();
        int count = 1;

        while(count <= num){
            if(count%3 == 0 && count%5 == 0){
                System.out.println("FizzBuzz");
                count++;
            }
            else if(count%5 == 0){
                System.out.println("Buzz");
                count++;
            }
            else if(count%3 ==0){
                System.out.println("Fizz");
                count++;
            }
            else{
                System.out.println(count);
                count++;
            }
        }

    }
}
