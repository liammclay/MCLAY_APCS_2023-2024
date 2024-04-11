public class BinarySearch {
    public static void main(String[] args) {
        BinarySearch binary = new BinarySearch();
        OneThousandSortedRandomNumbers list = new OneThousandSortedRandomNumbers();

        binary.output(binary.search(list.getSortedNumbers(), -8388));
        binary.output(binary.search(list.getSortedNumbers(), 9807));
        binary.output(binary.search(list.getSortedNumbers(), -4011));
        binary.output(binary.search(list.getSortedNumbers(), 5423));
        binary.output(binary.search(list.getSortedNumbers(), -4));
        binary.output(binary.search(list.getSortedNumbers(), 56));
        binary.output(binary.search(list.getSortedNumbers(), -990));
        binary.output(binary.search(list.getSortedNumbers(), 999));      
    }

    public int search(int[] arr, int num){
        int left = 0;  //initially the left bound will be zthe first index
        int right = arr.length - 1; // initially the right bound will be the last index

        while(left <= right){  //if left equals right you found the target, if its greater than right the target doesnt exist
            int middle = (left+right)/2;  //the average of two numbers is their middle

            if(num<arr[middle]){  //checks if the middle is to the right of the number
                right = middle-1;  //makes the right bound the middle
            }
            else if (num>arr[middle]){  //checks if the middle is to the left of the number
                left = middle+1;  //makes the left bound the middle
            }
            else{
                System.out.println("Loops: "+(middle+1));
                return middle; //if the target isnt greator that or less than the middle, it is the middle
            }
        }
        return -1;  //if the target isnt in the array than this will stop the loop and indicate it couldnt be found
    }

    public void output(int index){
        if(index >=0){
            System.out.println("Location : "+index);
        }
        else{
            System.out.println("Location not found.");
        }
    }
}
//used binary search and a custome method to interpret it to find the numbers.