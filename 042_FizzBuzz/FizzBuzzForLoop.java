import java.util.Scanner;
public class FizzBuzzForLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("FizzBuzz; we take turns counting up from one.  for numbers divisible by 3 you say Fizz, if they are divisible by 5 you say Buzz, if they are divisible by both say Fizbuzz. how high do you want me to go?");
        int num = scan.nextInt();

        for(int i=1; i<=num; i++){
            if(i%3 == 0 && i%5 == 0){
                System.out.println("FizzBuzz");
                
            }
            else if(i%5 == 0){
                System.out.println("Buzz");
                
            }
            else if(i%3 ==0){
                System.out.println("Fizz");
                
            }
            else{
                System.out.println(i);
                
            }
        }
    }
}        
// used a for loop to check each nukber if it was divisible by 3 or 5 and printed out accordingly