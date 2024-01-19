public class Shirt {
    String color;
    String brand;
    String type;
    Boolean isClean;

    public Shirt(){
        color = "blue";
        brand = "Essentials";
        type = "T-Shirt";
        isClean = true;
    }

    public Shirt(String color, String brand, String type, Boolean isClean){
        this.color = color;
        this.brand = brand;
        this.type = type;
        this.isClean = isClean;
    }
 
    public void selfDescription(){
        System.out.println("This is a "+color+" "+type+" from "+brand+". and is it clean? "+isClean);
    }

    public void fold(){
        System.out.println("The shirt is folded");
    }

    public void cleanStatus(Boolean isClean){
        this.isClean = isClean;
        if(this.isClean = true){
            System.out.println("the shirt is clean");
        }
        else{
            System.out.println("the shirt is dirty");
        }
    }
}
