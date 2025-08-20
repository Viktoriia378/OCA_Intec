package workWithArrays;

public class UsingAnArray {
    public static void main(String[] args) {
        String[] mammals = {"monkey", "chimp", "donkey"};
        System.out.println(mammals.length); //3
        System.out.println(mammals[0]); //monkey

        int[] numbers = new int[10];
        for(int i = 0; i < numbers.length; i ++) {
            numbers[i] = i + 5; //start with 5 until 14
            System.out.println(numbers[i]);
        }

        //numbers[numbers.length] = 5; //does not compile; [numbers.length -1]    }
}}
