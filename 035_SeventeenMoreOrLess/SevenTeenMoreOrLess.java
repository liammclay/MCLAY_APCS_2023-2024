import java.util.Scanner;
public class SevenTeenMoreOrLess {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("what is the first integer? ");
        int num1 = scan.nextInt();
        System.out.print("what is the second integer? ");
        int num2 = scan.nextInt();
        System.out.print("what is the third integer? ");
        int num3 = scan.nextInt();

        if (num1+17 == num2){
            System.out.println(num1+" is 17 less than "+num2);
        }
        else if (num1+17 == num3){
            System.out.println(num1+" is 17 less than "+num3);
        }
        else{
            
        }

        if (num2+17 == num1){
            System.out.println(num2+" is 17 less than "+num1);
        }
        else if (num2+17 == num3){
            System.out.println(num2+" is 17 less than "+num3);
        }
        else{
            
        }

        if (num1-17 == num2){
            System.out.println(num1+" is 17 greater than "+num2);
        }
        else if (num1-17 == num3){
            System.out.println(num1+" is 17 greater than "+num3);
        }
        else{
            
        }

        if (num2-17 == num1){
            System.out.println(num2+" is 17 greater than "+num1);
        }
        else if (num2-17 == num3){
            System.out.println(num2+" is 17 greater than "+num3);
        }
        else{
            
        }

        if (num3+17 == num1){
            System.out.println(num3+" is 17 less than "+num1);
        }
        else if (num3+17 == num2){
            System.out.println(num3+" is 17 less than "+num2);
        }
        else{
            
        }

        if (num3-17 == num2){
            System.out.println(num3+" is 17 greater than "+num2);
        }
        else if (num3-17 == num1){
            System.out.println(num3+" is 17 greater than "+num1);
        }
        else{
            
        }
    }
}
/*
 * took user imput and figured out if each number was 17 less than the others, and if they were 17 more
 */