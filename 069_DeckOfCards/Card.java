public class Card {
    private String suit;
    private int value;

    public Card(String suit, int value){
        this.suit = suit;
        this.value = value; 
    }

    public void description(){
        System.out.println(value+" of "+suit);
    }

    public void getSuit(){
        System.out.println(suit);
    }
    public void getValue(){
        System.out.println(value);
    }

    public void setSuit(String newSuit){
        this.suit = newSuit;
    }
    public void setValue(int newValue){
        this.value = newValue;
    }
}
