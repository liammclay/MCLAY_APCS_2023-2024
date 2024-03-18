public class Card {
    private String suit;
    private String value;

    public Card(String suit, String value){
        this.suit = suit;
        this.value = value; 
    }

    public String description(){
        return (value+" of "+suit);
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
    public void setValue(String newValue){
        this.value = newValue;
    }
}
