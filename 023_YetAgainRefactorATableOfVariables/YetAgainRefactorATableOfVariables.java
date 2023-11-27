
import java.util.Scanner;
public class YetAgainRefactorATableOfVariables 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        double oneSquared = Math.pow(1.0, 2.0);
        double oneCubed = Math.pow(1.0, 3.0);
        
        double twoSquared = Math.pow(2.0, 2.0);
        double twoCubed = Math.pow(2.0, 3.0);
        
        double threeSquared = Math.pow(3.0, 2.0);
        double threeCubed = Math.pow(3.0, 3.0);
        
        double fourSquared = Math.pow(4.0, 2.0);
        double fourCubed = Math.pow(4.0, 3.0);

        System.out.println("a   a^2  a^3");
        System.out.println(1+"   "+oneSquared+"    "+oneCubed);
        System.out.println(2+"   "+twoSquared+"    "+twoCubed);
        System.out.println(3+"   "+threeSquared+"    "+threeCubed);
        System.out.println(4+"   "+fourSquared+"   "+fourCubed);
        System.out.print("what other number would you like to know?(decimal)");
        double num = scan.nextDouble();

        double numsquared = Math.pow(num, 2.0);
        double numCubed = Math.pow(num, 3.0);

        System.out.println(num+"   "+numsquared+"   "+numCubed);




    }
    
}

/*

1/1 - Compiles
1/1 - Content
0/1 - Formatting
-Extra spacing - watch out!
1/1 - Comments

*/