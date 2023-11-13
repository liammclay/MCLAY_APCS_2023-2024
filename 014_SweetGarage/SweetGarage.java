public class SweetGarage 
{
    public static void main(String[] args)
    {
        Car jeep = new Car(1997, 42_250, "Jeep", "Wrangler");
        Car honda = new Car();
        Car bat = new Car(2005, 42000, "Bat Mobile", "model: Christian Bale");
        Car kai = new Car(2023, 100, "Kai's Smart car", "One seater");
        Car bond = new Car(2015, 69000, "Astin martin", "from James Bond", true);

        System.out.println("the "+jeep.year);
        System.out.println(jeep.manufacturerName);
        System.out.println(jeep.modelName);
        System.out.println("has "+jeep.milesDriven+" miles on it.");
        System.out.println(" ");

        System.out.println("the "+honda.year);
        System.out.println(honda.manufacturerName);
        System.out.println(honda.modelName);
        System.out.println("has "+honda.milesDriven+" miles on it.");
        System.out.println(" ");

        System.out.println("the "+bat.year);
        System.out.println(bat.manufacturerName);
        System.out.println(bat.modelName);
        System.out.println("has "+bat.milesDriven+" miles on it.");
        System.out.println(" ");

        System.out.println("the "+kai.year);
        System.out.println(kai.manufacturerName);
        System.out.println(kai.modelName);
        System.out.println("has "+kai.milesDriven+" miles on it.");
        System.out.println("(Yohannes is not allowed)");
        System.out.println(" ");

        System.out.println("the "+bond.year);
        System.out.println(bond.manufacturerName);
        System.out.println(bond.modelName);
        System.out.println("has "+bond.milesDriven+" miles on it."); 
        System.out.println(" ");
        
        bond.revEngine();
        bond.engageTurbo();
        

    }
}
/* made all the acrs objects, put them into print functions.  
then used the rev engine amd turbo funtions of james bond car */

/*

1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments

*/