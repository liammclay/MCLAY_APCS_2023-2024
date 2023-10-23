public class MaximumInteger 
{
    public static void main(String[] args)
    {
    int num1 = Integer.MIN_VALUE;
    int num2 = Integer.MAX_VALUE;

    System.out.println("max value is "+num2);
    System.out.println("min value is "+num1);

    int overflow = num2+2147483647+1000002;
    int underflow = num1-(2147483647-744);

    System.out.println("overflow is "+ overflow);
    System.out.println("undeflow is "+ underflow);

    }
}

/*made inegers of the maxes and mins
oveflowed the max so it went back to min
and did the other way around
 * 
 */