import java.util.ArrayList;

public class FavoriteBooksTwo {
    public static void main(String[] args) {
        ArrayList<String> books = new ArrayList<String>();
        
        books.add (new String("To Kill A Mockingbird"));
        books.add (new String("Book Thief"));
        books.add (new String("Heros of Olympus"));

        System.out.println("My favorite books are:");
        
        for(String book : books){
            System.out.println(book);
        }
    }
}

/*

3/3 - Compile/Content
1/1 - Formatting
0/1 - Comments
-One half hearted commend on one file doesn't qualify.

*/