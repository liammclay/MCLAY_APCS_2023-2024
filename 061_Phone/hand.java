public class hand {
    public static void main(String[] args) {
        Phone iPhone = new Phone("Lightning", 50, "15", "black", "Apple", "pro max");
        ChargingCable one = new ChargingCable( "Apple",  3,  "Lightning",  iPhone.currentCharge);


        one.charging();
        iPhone.photo();
        iPhone.weather();
        iPhone.settings();
        iPhone.calculator();
        iPhone.subwaySurfers();
    }
}
