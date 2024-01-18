import java.util.Scanner;
public class NameGreeting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = scan.nextLine();

        greeting(name);
        
    }
    public static void greeting(String name) {
        System.out.println("Hell there, "+name+".");
    }
}
// I made a method that took a string input, and printed Hello "String".  I used scanner to get a string from the user.

/*

3/3 - Compile/Content
1/1 - Formatting
1/1 - Comments

*/