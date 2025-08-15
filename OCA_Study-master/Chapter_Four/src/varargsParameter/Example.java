package varargsParameter;

public class Example {
    //a method may use a vararg parameter
    //it has to be the last element in a method's parameter list
    //one vararg parameter per method

    public void walk1(int ... nums){}
    public void walk2(int start, int... nums){}
    //public void walk3(int... nums, int start){} does not compile bcs vararg is not the last
    //public void walk4(int... start, int... nums){} does not compile bcs we have TWO varargs

    // with vararg we can make array or list
    //we can even not add value for our vararg - java will create an empty array of length zero

    public static void walk(int start, int ... nums){
        System.out.println(nums.length);
    }

    public static void run(int... nums){
        System.out.println(nums[1]);
    }

    public static void main(String[] args) {
        walk(1);
        walk(1,2);
        walk(1,2,3);
        walk(1,new int[]{4,5});

        //we can add null but we ll have exception bcs int can not have null

        walk(1, null);

        //we can use index to with vararg

        run(11,22); //22 bcs we are calling the second element in our method
    }
}
