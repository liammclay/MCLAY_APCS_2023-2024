public class Garage 
{
    
    public static void main(String[] args)
    {
        Car jeep = new Car(1997, 42_250, "Jeep", "Wrangler");

        System.out.println(jeep.year);
        System.out.println(jeep.manufacturerName);
        System.out.println(jeep.modelName);
        System.out.println("with "+jeep.milesDriven+" miles on it.");

        jeep.revEngine();

    }
}