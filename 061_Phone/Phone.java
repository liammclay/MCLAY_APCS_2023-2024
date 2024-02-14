public class Phone {
    private String connectionType;
    int currentCharge;
    private String model;
    String color;
    private String brand;
    private String size;

    public Phone(){
        this.connectionType = "Lightning";
        this.currentCharge = 50;
        this.model = "14";
        this.color = "black";
        this.brand = "iPhone";
        this.size = "pro max";
    }

    public Phone(String connectionType, int currentCharge, String model, String color, String brand, String size){
        this.connectionType = connectionType;
        this.currentCharge = currentCharge;
        this.model = model;
        this.color = color;
        this.brand = brand;
        this.size = size;
    }

    public void getConnectionType(){
        System.out.println("The connection type is currently, "+connectionType);    
    }

    public void setConnectionType(String newType){
        connectionType = newType;
        System.out.println("The connection type is now "+connectionType);
    }

    public void getModel(){
        System.out.println("The model is currently, "+model);
    }

    public void setModel(String newModel){
        model = newModel;
        System.out.println("The model is now, "+model);
    }
    public void getBrand(){
        System.out.println("The brand is currently, "+brand);
    }

    public void setBrand(String newBrand){
        brand = newBrand;
        System.out.println("The brand is now, "+brand);
    }

    public void getSize(){
        System.out.println("The size is currently, "+size);
    }

    public void setSize(String newSize){
        size = newSize;
        System.out.println("The size is now, "+size);
    }

    public void photo(){
        System.out.println("Chick, the phone took a photo");
    }

    public void weather(){
        System.out.println("The weather app says its 70 and sunny");
    }

    public void subwaySurfers(){
        System.out.println("YOu play subway surfers tell you get board, you scored 1,025,336");
    }

    public void settings(){
        System.out.println("You mess with your settings, but now everything is in arabic and you have no idea how to change it back.");
    }
    public void calculator(){
        System.out.println("you use your calculator and ur crazy at math.");
    }
}
