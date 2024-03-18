public class Deck {
    private String[] deck = new String[52];

    public Deck(){

    }

    public String[] createDeck(){
        String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
        String[] values = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        
        int index = 0;
        
        for(String suit : suits){
            for(String value : values){  
                
                Card card = new Card(suit, value);
                this.deck[index] = card.description();  
                index++;
            }
        }
        
        String[] cardDeck = deck;
        return cardDeck;
    }
}
