package varargsParameter;

public class Example2 {
    public static void count(String ... txt){
        System.out.println(txt.length);
    }
    public static void count2(int ... nums){
        System.out.println(nums.length);
    }
    public static void main(String[] args) {
        count("bebe", null); //does not  throw exception bcs its object
        //count2(1, null); //compile error
        count2(new int[]{4,5});
        count2(null); //not compile error but exception nullPointer
     }

}
