public class Pen{
    
    static String colorOfInk = "black";
    static String colorOfPen = "grey";
    static String capOrClickey = "cap";
    static int inkRemaining = 0;
    static Boolean clickedOrCapOff = false;

    public static void inkRemaining(){
        System.out.println("the pen has "+inkRemaining+"% of its ink left");
    }
    public static void capOff(){
        if(capOrClickey.equals("cap")){
            System.out.println("The cap is off");
            clickedOrCapOff = true;
        }
        else{
            System.out.println("This is a clicky pen.");
        }
    }
    public static void clickedOut(){
        if(capOrClickey.equals("clickey")){
            System.out.println("The pen is clicked.");
            clickedOrCapOff = true;
        }
        else{
            System.out.println("This is a capped pen.");
        }
    }
    public static void wordsToWrite(String words){
        if(clickedOrCapOff == true){
            System.out.println("The pen writes, \""+words+"\"");
        }
    }



}
//made varaibles and the used them in the methods i made.