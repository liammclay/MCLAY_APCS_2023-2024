import java.util.Scanner;
public class InsertionSortSomeIntegers {
    public static void main(String[] args) {
        InsertionSortSomeIntegers insertion = new InsertionSortSomeIntegers();
        Scanner scan = new Scanner(System.in);

        System.out.println("How many random integers would you like to generate?");
        int num = scan.nextInt();
        System.out.println("Here are your integers:");

        int[] integers = new int[num];

        for(int i=0; i<num; i++){
            int integer = (int) (Math.random()*num*1000+1);
            integers[i] = integer;
            System.out.print(integer+", ");
        }
        
        System.out.println("");
        System.out.println("Here are your integers sorted:");

        insertion.sort(integers);
        for(int integer:integers){
            System.out.print(integer+", ");
        }
    }

    public int[] sort(int[] arr){  // takes in and returns integer array
        for(int i=1; i < arr.length; i++) {  // loops through array
            int temp = arr[i];  //starts at second index value
            int possibleIndex = i;  // starts at second index

            while(possibleIndex>0 && temp <arr[possibleIndex-1]){  //while the index exists and while its value is greater than index-1
                arr[possibleIndex]=arr[possibleIndex-1];  //replaces the index value with the index-1
                possibleIndex--;  // moves the possible index to the left
            }
            arr[possibleIndex] = temp;  //now that the index has found the right spot it sets the spot to the stored original value
        }
        return arr;  //returns the sorted array
    }
}
//loaded an array with a for loop, and used insertion sort on the array.
// then I printed out the array with a for each loop.