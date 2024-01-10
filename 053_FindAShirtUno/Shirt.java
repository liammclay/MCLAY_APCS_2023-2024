public class Shirt {
    
    static String color = "brown";
    static String brand = "Old Navy";
    static String type = "T-Shirt";
    static Boolean isClean = true;

    
    
    public static void selfDescription(){
        System.out.println("The shirt is a "+color+" "+type+" from "+brand+".");
    }
    public static void fold(){
        System.out.println("the shirt is folded.");
    }
    public static void cleanStatus(){
        if(isClean == true){
            System.out.println("The shirt is clean.");
        }
        else if(isClean == false){
            System.out.println("The shirt is not clean.");
        }
        else{
            System.out.println("I don't know if the shirt is clean or not.");
        }
    }

}
//made methods using varaibles from the top