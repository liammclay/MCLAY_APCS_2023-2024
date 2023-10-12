import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;

public class Main {
  public static void main(String[] args) {
    
    World habitat =  new World(220, 220);
    Turtle kai = new Turtle(habitat);

    kai.forward(50);
    
    kai.turnRight();
    kai.forward(50);
    
    kai.turnRight();
    kai.forward(50);

    kai.turnRight();
    kai.forward(50);

    kai.turnRight();
    kai.forward(25);
    
    kai.turnRight();
    kai.forward(50);
    
    kai.turnRight();
    kai.forward(25);
    
    kai.turnRight();
    kai.forward(25);
    
    kai.turnRight();
    kai.forward(50);
    
    habitat.show(true);
    

    /*created the world, and put tghe turtle in the world.
     * had turtle make a box and then draw a t
     */
    
    //Refer back to your Runestone academy book as needed.
    //Instantiate the world. The world should be 220x220.
    
    //Instantiate a turtle. Name it as you wish.

    /*Have your turtle make 4 boxes in the world. The boxes should be in a 2x2 grid. Similar to this:
     ___ ___ 
    |   |   |
    |___|___|
    |   |   |
    |___|___|

    */


    
    //Finally, set the world to be visible with a boolean. Ex: worldName.setVisible(the proper boolean);
  }
}
