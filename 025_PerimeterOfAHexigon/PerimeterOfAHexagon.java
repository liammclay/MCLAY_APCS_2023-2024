import java.util.Scanner;
public class PerimeterOfAHexagon {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("what is the length of a side? ");
        double length = scan.nextDouble();

        double rad3 = Math.sqrt(3.0);
        double lengthsqrd = Math.pow(length, 2);
        double perimeter = length*6.0;
        double area = (3*rad3*lengthsqrd)/2;

        System.out.println("perimeter is "+perimeter);
        System.out.println("area is "+area);
        
    }
    
}
/*took the length 
found peremiter and area using math and printed it
 */

/*

1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments

*/