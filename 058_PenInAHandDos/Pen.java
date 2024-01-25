public class Pen {
    String colorOfInk;
    String colorOfPen;
    String capOrClickey;
    int inkRemaining;
    

    public Pen(){
        colorOfInk = "black";
        colorOfPen = "black";
        capOrClickey = "cap";
        inkRemaining = 100;
    }

    public Pen(String colorOfInk, String colorOfPen, String capOrClickey, int inkRemaining){
        this.colorOfInk = colorOfInk;
        this.colorOfPen = colorOfPen;
        this.capOrClickey = capOrClickey;
        this.inkRemaining = inkRemaining;
    }

    public void inkRemaining(){
        System.out.println("The "+colorOfPen+" pen with "+colorOfInk+" ink has "+inkRemaining+"% of its ink left.");
    }

    public void capOff(){
        if(capOrClickey.equals("cap")){
            System.out.println("the cap is off.");
        }
        else{
            System.out.println("You can't uncap a clicky pen.");
        }
    }

    public void clickedOut(){
        if(capOrClickey.equals("cap")){
            System.out.println("You can't click a capped pen");
        }
        else{
            System.out.println("The pen is clciked out.");
        }

    }

    public void wordsToWrite(String words){
        System.out.println("The pen writes,\""+words+"\"");
    }


    
}
