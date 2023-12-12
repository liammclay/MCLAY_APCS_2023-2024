import java.util.Scanner;
public class BasicNestedPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What single character would you like to use?(I will use the first character given)");
        String character = scan.nextLine();
        character = character.substring(0,1);

        System.out.println("How many rows?(integer)");
        int rows = scan.nextInt();

        System.out.println("How many colomns?(integer)");
        int colomns = scan.nextInt();

        for(int i = 0; i < rows; i++){

            for(int j = 0; j < colomns; j++){
                System.out.print(character);
            }
            System.out.println("");
        }
    }
}
