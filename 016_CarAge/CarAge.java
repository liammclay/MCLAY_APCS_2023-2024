public class CarAge 
{
    public static void main(String[] args)
    {
        ReturningCalculator calc = new ReturningCalculator();

        Car jeep = new Car(1997, 42_250, "Jeep", "Wrangler");
        Car honda = new Car();
        Car bat = new Car(2005, 42000, "Bat Mobile", "model: Christian Bale");
        Car kai = new Car(2023, 100, "Kai's Smart car", "One seater");
        Car bond = new Car(2015, 69000, "Astin martin", "from James Bond", true);

        int year = 2023;
        
        int jeepYear = calc.integerSubtractor(year, jeep.year);
        int hondaYear = calc.integerSubtractor(year, honda.year);
        int batYear = calc.integerSubtractor(year, bat.year);
        int kaiYear = calc.integerSubtractor(year, kai.year);
        int bondYear = calc.integerSubtractor(year, bond.year);

        System.out.println("The jeep is "+jeepYear+" years old.");
        System.out.println("The jeep is "+hondaYear+" years old.");
        System.out.println("The jeep is "+kaiYear+" years old.");
        System.out.println("The jeep is "+batYear+" years old.");
        System.out.println("The jeep is "+bondYear+" years old.");


    }
    
}
/*pulled calculator, and used its subtraction method to get 
the age of the cars, the printed it  */

/*

1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments

*/