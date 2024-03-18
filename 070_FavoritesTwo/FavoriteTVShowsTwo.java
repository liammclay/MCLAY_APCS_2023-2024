import java.util.ArrayList;
public class FavoriteTVShowsTwo {
    public static void main(String[] args) {
        ArrayList<String> tvShows = new ArrayList<>();
    
        tvShows.add(new String("It's Alwasy Sunny in Philidelphia"));
        tvShows.add(new String("South Park"));
        tvShows.add(new String("Warrior"));

        System.out.println("my favorite movies are:");
        for(String shows:tvShows){
            System.out.println(shows);
        }
    }
}
//made an array list and added strings to the array.
