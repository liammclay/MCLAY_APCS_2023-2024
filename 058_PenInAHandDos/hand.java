public class hand {
    public static void main(String[] args) {
        Pen penOne = new Pen();
        Pen penTwo = new Pen("black", "grey", "cap", 10);
        Pen penThree = new Pen("blue", "black", "clicky", 65);
        Pen penFour = new Pen("red", "grey", "clicky", 0);

        penTwo.inkRemaining();
        penTwo.capOff();
        penTwo.clickedOut();
        penTwo.wordsToWrite("hello");
        
        penThree.inkRemaining(); 
        penThree.capOff();
        penThree.clickedOut(); 
        penThree.wordsToWrite("kai sucks"); 
        
        penFour.inkRemaining(); 
        penFour.capOff();  
        penFour.clickedOut(); 
        penFour.wordsToWrite("I hope kai passes this class, but its not likely."); 
    }
}
//made objects from pen class. used methods on all of the pens i made to describe/use them

/*

3/3 - Compile/Content
1/1 - Formatting
1/1 - Comments

*/