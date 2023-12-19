import java.util.Scanner;
public class BlackJackOne {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int cardOne = (int)(Math.random()*13+1);
        int cardTwo = (int)(Math.random()*13+1);
        int cardThree = (int)(Math.random()*13+1);
        String card1 = "";
        String card2 = "";
        String card3 = "";

        if (cardOne == 1){
            card1 = "ace";
        }
        else if (cardOne == 2){
            card1 = "two";
        }
        else if (cardOne == 3){
            card1 = "three";
        }
        else if (cardOne == 4){
            card1 = "four";
        }
        else if (cardOne == 5){
            card1 = "five";
        }
        else if (cardOne == 6){
            card1 = "six";
        }
        else if (cardOne == 7){
            card1 = "seven";
        }
        else if (cardOne == 8){
            card1 = "eight";
        }
        else if (cardOne == 9){
            card1 = "nine";
        }
        else if (cardOne == 10){
            card1 = "ten";
        }
        else if (cardOne == 11){
            card1 = "jack";
            cardOne = 10;
        }
        else if (cardOne == 12){
            card1 = "queen";
            cardOne = 10;
        }
        else if (cardOne == 13){
            card1 = "king";
            cardOne = 10;
        }

        if (cardTwo == 1){
            card2 = "ace";
        }
        else if (cardTwo == 2){
            card2 = "two";
        }
        else if (cardTwo == 3){
            card2 = "three";
        }
        else if (cardTwo == 4){
            card2 = "four";
        }
        else if (cardTwo == 5){
            card2 = "five";
        }
        else if (cardTwo == 6){
            card2 = "six";
        }
        else if (cardTwo == 7){
            card2 = "seven";
        }
        else if (cardTwo == 8){
            card2 = "eight";
        }
        else if (cardTwo == 9){
            card2 = "nine";
        }
        else if (cardTwo == 10){
            card2 = "ten";
        }
        else if (cardTwo == 11){
            card2 = "jack";
            cardTwo = 10;
        }
        else if (cardTwo == 12){
            card2 = "queen";
            cardTwo = 10;
        }
        else if (cardTwo == 13){
            card2 = "king";
            cardTwo = 10;
        }

        if (cardThree == 1){
            card3 = "ace";
        }
        else if (cardThree == 2){
            card3 = "two";
        }
        else if (cardThree == 3){
            card3 = "three";
        }
        else if (cardThree == 4){
            card3 = "four";
        }
        else if (cardThree == 5){
            card3 = "five";
        }
        else if (cardThree == 6){
            card3 = "six";
        }
        else if (cardThree == 7){
            card3 = "seven";
        }
        else if (cardThree == 8){
            card3 = "eight";
        }
        else if (cardThree == 9){
            card3 = "nine";
        }
        else if (cardThree == 10){
            card3 = "ten";
        }
        else if (cardThree == 11){
            card3 = "jack";
            cardThree = 10;
        }
        else if (cardThree == 12){
            card3 = "queen";
            cardThree = 10;
        }
        else if (cardThree == 13){
            card3 = "king";
            cardThree = 10;
        }

        int total = cardOne+cardTwo;

        System.out.println("you are delt a "+card1+" and a "+card2+".");
        System.out.println("your total is "+total);
        System.out.print("would you like to hit or stand? ");
        String choice = scan.nextLine();

        if (choice.equals("hit")){
            System.out.println("you have a "+card1+", a "+card2+", and a "+card3);

            if(cardOne+cardTwo+cardThree > 21){
                int tot = cardOne+cardTwo+cardThree;
                System.out.println("your final value was "+tot+"you busted");
            }
            else{
            System.out.println("good job you didnt bust");
            }
        }
        else if (choice.equals("stand")){
            if(cardOne+cardTwo > 21){
                int tot = cardOne+cardTwo;
                System.out.println("your final value was "+tot+" you busted");
            }
            else{
            System.out.println("good job you didnt bust");
            }
        }
    }
}
/*
 * took random numbers and made them into cards(strings)
 * told them what they had
 * asked if they wanted to hit
 * gave them new card and told them total
 * said if busted or not
 */

/*

1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments

*/