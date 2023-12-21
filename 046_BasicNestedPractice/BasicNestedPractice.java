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

        if(colomns <= 20 && rows <=20){
            for(int i = 0; i < rows; i++){

            for(int j = 0; j < colomns; j++){
                System.out.print(character);
            }
            System.out.println("");
        }
        }
        else{
            System.out.println("too many rows or colomns. try again and keep it under 20");
        }
    }
}
// asked for character and rows and colomns.  then used that info with imbeded for loop to make grid

/*

1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments

*/