public class LorumIpsumStringMethods {
    public static void main(String[] args){
        String lorumIpsum =  "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Quam quisque id diam vel quam elementum pulvinar. In dictum non consectetur a. Mauris augue neque gravida in fermentum et sollicitudin. Elit ullamcorper dignissim cras tincidunt lobortis feugiat. Magna fermentum iaculis eu non diam phasellus vestibulum lorem. Magna etiam tempor orci eu lobortis elementum nibh tellus. Venenatis lectus magna fringilla urna porttitor rhoncus dolor purus. Velit scelerisque in dictum non consectetur a. Eget aliquet nibh praesent tristique magna sit amet purus. Suspendisse ultrices gravida dictum fusce ut placerat. Neque laoreet suspendisse interdum consectetur libero id faucibus. In aliquam sem fringilla ut morbi.                         ";


        String trimmed = lorumIpsum.trim();

        System.out.println("The blob is "+lorumIpsum.length()+" characters long");
        System.out.println("The trimmed blob is now "+trimmed.length()+" characters long");
        System.out.println("The blob upper case is: "+trimmed.toUpperCase());
        System.out.println("The blob lower case is: "+trimmed.toLowerCase());
        System.out.println("The trimmed blob is equal to the original blob? "+trimmed.equals(lorumIpsum)+" -Dwight Sherwt");
        System.out.println("The blob is equal to the blob?"+trimmed.equals(trimmed));
        String letter = "q";
        System.out.println("The letter q first appears at index "+trimmed.indexOf(letter));
        System.out.println("If you replace all of the o's with x's, it goes: "+trimmed.replace("o", "x"));
        System.out.println("Does the blob contain the letter z? "+trimmed.contains("z"));
    }
    
}
/*put lourm ipom in a string variable.
 * trimmed it in another variable.
 * made a series of print statements using string methods. 
 */

 /*

1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments

*/