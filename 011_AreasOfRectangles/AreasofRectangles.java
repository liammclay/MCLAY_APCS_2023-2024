public class AreasofRectangles 
{
    public static void main(String[] args)
    {
        double widthOne = 5.5;
        double heightOne = 7.8;

        double widthTwo = 99.4;
        double heightTwo = 500.352;

        double widthThree = 75;
        double heightThree = 800;

        double widthFour = 500029.75;
        double heightFour =90029384;

        double widthFive = 600000;
        double heightFive = 8343491034.0;

        double areaOne = widthOne*heightOne;
        double areaTwo = widthTwo*heightTwo;
        double areaThree = widthThree*2.54*heightThree;
        double areaFour = widthFour*(heightFour/2.54);
        double areaFive = (widthFive/91.44)*(heightFive/914.4);
        
        System.out.println("the area of tringle one is "+areaOne+" inches");
        System.out.println("the area of tringle two is "+areaTwo+" cm");
        System.out.println("the area of tringle three is "+areaThree+" cm");
        System.out.println("the area of tringle four is "+areaFour+" inches");
        System.out.println("the area of triangle five is "+areaFive+" yards");
            
    }
}
/*made variable for each value.  then i made a varaible to convert and find
 * area.  then printed the areas.
 */