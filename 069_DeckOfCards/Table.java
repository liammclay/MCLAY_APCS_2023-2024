public class Table {
    public static void main(String[] args) {
        Deck deck = new Deck();

        String[] deck1 = deck.createDeck();

        for(String cards : deck1){
            System.out.println(cards);
        }
    }
}
//used nested for each loops to create all 52 cards in an array.
//wich made it possible to create multiple decks in table.

/*

3/3 - Compile/Content
1/1 - Formatting
1/1 - Comments

*/