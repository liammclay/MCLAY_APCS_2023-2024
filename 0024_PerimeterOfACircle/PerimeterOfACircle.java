import java.util.Scanner;
public class PerimeterOfACircle 
{
    public  static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("what is the radius of the circle? ");
        double radius = scan.nextDouble();

        double perimeter = radius*2*Math.PI;
        double area = Math.pow(Math.PI*radius, 2);

        System.out.println("perimeter is "+perimeter);
        System.out.println("area is "+area);
    }
    
}
/*took the radius multiplied it by 2 pi and printed it */