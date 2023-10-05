public class RefactorATableOfVariables 
{
    public static void main(String[]argss)
    {
        int one = 1;
        int two = 2;
        int three = 3;
        int four = 4;

        int oneSquared = one*one;
        int oneCubed = one*one*one;
        
        int twoSquared = two*two;
        int twoCubed = two*two*two;
        
        int threeSquared = three*three;
        int threeCubed = three*three*three;
        
        int fourSquared = four*four;
        int fourCubed = four*four*four;

        System.out.println("a   a^2  a^3");
        System.out.println(one+"   "+oneSquared+"    "+oneCubed);
        System.out.println(two+"   "+twoSquared+"    "+twoCubed);
        System.out.println(three+"   "+threeSquared+"    "+threeCubed);
        System.out.println(four+"   "+fourSquared+"   "+fourCubed);
    }
}
/*i made a variable for the four base numbers, 1-4.  then i made vaiabls 
 * that were the multibples of the orginals by multiplying it by itself.
 * ten i printed it
 */

/*

1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments

*/