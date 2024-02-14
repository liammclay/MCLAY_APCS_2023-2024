public class ChargingCable {
    String brand;
    double length;
    private String connectionType;
    int iPadCharge;

    public ChargingCable(String brand, double length, String connectionType, int iPadCharge){
        this.brand = brand;
        this.length = length;
        this.connectionType = connectionType;
        this.iPadCharge = iPadCharge;
    }
    public void charging(){
        if(connectionType.equals("Lightning")){
            System.out.println("The "+brand+" "+length+"ft. charger can connect to the device. The charge is 100.");
        }
        else{
            System.out.println("The "+brand+" "+length+"ft. charger cannot connect to the device.  The charge is still "+iPadCharge+".");
        }
    }
    public void getConnectionType(){
        System.out.println("The current connection type is, "+connectionType);
    }
    public void setConnectionType(String newConnectionType){
        connectionType = newConnectionType;
        System.out.println("The connection type is now, "+connectionType);
    }
}

