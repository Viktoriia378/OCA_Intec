package intecOCA.test1;

public class Q44 {
    public static void main(String[] args) {
        int [] [] array = {{0}, {0,15},{0,14,2},{0,12,2,3},{0,1,2,3,4}};
        int[] arr1 = array[4];
        //System.out.println(arr1[4][1]); does not compile
        System.out.println(arr1[4]);
        System.out.println(array[4][1]);
     }
}
