public class ComputeAnExpressionTwo 
{
    public static void main(String[] args)
    {
           ReturningCalculator calc = new ReturningCalculator();
    double nine = 9.5;
    double four = 4.5;
    double two = 2.5;
    double three = 3;
    double fourty = 45.5;
    double threef = 3.5;

    double math1 = calc.doubleMultiplier(nine, four);
    double math2 = calc.doubleMultiplier(two, three);
    double math3 = calc.doubleSubtractor(math1, math2);
    double math4 = calc.doubleSubtractor(fourty, threef);
    double math5 = calc.divider(math3, math4);

    System.out.println(math5);
    }
}
/*made calculator (object?).  
used calulator for computaions and printd result */

/*

1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments

*/