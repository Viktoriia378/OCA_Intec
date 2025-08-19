package studyWithChatty.chapter3;

public class TestArray {
    public static void main(String[] args) {
        Integer[] arr = new Integer[3];
        System.out.println(arr[0] + arr[1]); //arr[0] and arr[1] are null → unboxing during + causes NullPointerException

        int[] arr1 = new int[3];
        System.out.println(arr1[0] + arr1[1]);
    }
}
