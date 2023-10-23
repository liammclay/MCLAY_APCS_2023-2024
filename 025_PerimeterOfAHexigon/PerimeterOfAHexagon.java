import java.util.Scanner;
public class PerimeterOfAHexagon {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("what is the length of a side? ");
        double length = scan.nextDouble();

        double perimeter = length*6.0;
        double area = ((3*Math.pow(3,-(1/2)))/2)*Math.pow(length, 2);

        System.out.println("perimeter is "+perimeter);
        System.out.println("area is "+area);
    }
    
}
/*took the length foud peremiter and area using math and printed it */