public class Hand {
    public static void main(String[] args) {
        Pen myPen = new Pen();
        
        myPen.inkRemaining();
        myPen.capOff();
        myPen.wordsToWrite("Kai sucks");
        System.out.println("It perserviered despite being out of ink.");
    }
}
//used the methods from pen.java