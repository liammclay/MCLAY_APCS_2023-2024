public class GasPriceTracker {
    private double gasPrice;
    private String gasType;

    public GasPriceTracker(String gasType, double gasPrice){
        this.gasType = gasType;
        this.gasPrice = gasPrice;
    }

    public void getPrice(){
        System.out.println(gasPrice); 
    }
    public void setPrice(double newPrice){
        this.gasPrice = newPrice;
    }

    public void getType(){
        System.out.println(gasType); 
    }
    public void setType(String newType){
        this.gasType = newType;
    }

    public void printInfo(){
        System.out.println(gasType+" costs $"+gasPrice+".");
       
    }
    public static void main(String[] args) {
        
    }
}
