import java.util.Scanner;

public class Parrot {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        parrot();
    }

    public static void parrot(){
        System.out.println("Hola. me nombre senor pajaro.");
        String user = scan.nextLine();

        if(user.equals("Te amo Senor pajaro!")){
            System.out.println("yo tambien te amo");
            return;
        }
        else{
            System.out.println("Usted dijo, "+user);
            parrot();
        }
        
    }
}
// used recursion to loop until user puts in correct input