import java.util.Scanner;

public class CarBuilderOne 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("what year are you looking for? ");
        int year = scan.nextInt();

        System.out.print("what mileage are you looking for? ");
        int miles = scan.nextInt();
        scan.nextLine();

        System.out.print("what make are you looking for? ");
        String make = scan.nextLine();

        System.out.print("what model are you looking for? ");
        String model = scan.nextLine();

        Car car = new Car(year, miles, make, model);

        System.out.println("Great, we found a "+car.year+" "+car.manufacturerName+" "+car.modelName+" with "+car.milesDriven+" miles on it");


    }
    
}

/*used scanner to get the strings and ints from user and stored them in varaibaes
 * then put the vriables in the car object
 * used the new object to print out the car info
 */

/*

1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments

*/