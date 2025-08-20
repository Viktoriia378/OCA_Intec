package studyWithChatty.chapter3;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        String[] arr = {"a", "b", "c"};
        for (String s : arr) {
            s = s.toUpperCase();
            System.out.println(s);
        }
        System.out.println(Arrays.toString(arr));

        int[] nums = new int[3];
        System.out.println(nums[3]);
    }
}
