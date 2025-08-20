package arraysMethods;

import java.util.Arrays;

public class SearchingExample {
    public static void main(String[] args) {
        //works if array is already sorted
        //Array.binarySearch(variable of array, index);

        int[]numbers = {2,4,6,8};
        System.out.println(Arrays.binarySearch(numbers, 2)); //0
        System.out.println(Arrays.binarySearch(numbers, 4)); //1
        System.out.println(Arrays.binarySearch(numbers, 1)); //-1
        System.out.println(Arrays.binarySearch(numbers, 3)); //-2
        System.out.println(Arrays.binarySearch(numbers, 9)); //-5
        System.out.println(Arrays.binarySearch(numbers, 5));

        int[] number = new int[] {3,2,1};
        System.out.println(Arrays.binarySearch(number, 2));
        System.out.println(Arrays.binarySearch(number,3));
    }
}
