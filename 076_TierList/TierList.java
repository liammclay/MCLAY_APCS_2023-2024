public class TierList {
    public static void main(String[] args) {
        String[][] shirts = 
            {{"A", "T-Shirt", "Baggy Shirt"},
            {"B", "Long Sleeved", " "},
            {"C", "Collared Shirt", "V-Neck"},
            {"..."," "," "},
            {"F", "DressShirt"," "}};

            for( int row = 0; row < shirts.length; row++){
                for(int col = 0; col<shirts[0].length; col++){
                    System.out.print(shirts[row][col]+" ");
                }
                System.out.println("");
            }
    }
    
}
// made a 2d array, used a for loop to print out each row