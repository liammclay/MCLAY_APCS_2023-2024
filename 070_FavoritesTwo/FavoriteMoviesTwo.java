import java.util.ArrayList;
public class FavoriteMoviesTwo {
    public static void main(String[] args) {
        ArrayList<String> movies = new ArrayList<>();
    
        movies.add(new String("Step Brothers"));
        movies.add(new String("Good Will Hunting"));
        movies.add(new String("Kung Fu Panda"));

        System.out.println("my favorite movies are:");
        for(String movie:movies){
            System.out.println(movie);
        }
    }
}
