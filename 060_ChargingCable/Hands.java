public class Hands {
    public static void main(String[] args) {
        iPad ipad = new iPad(50);
        ChargingCable one = new ChargingCable( "Apple",  3,  "USB Micro",  ipad.currentCharge);
    
        one.charging();
        one.getConnectionType();
        one.setConnectionType("Lightning");
        one.charging();

    }
}
//made charging class that compares connection types, and tels you if youcan charge or not when you try to.
//i made the connection type private, because you chouldnt be able to change it.