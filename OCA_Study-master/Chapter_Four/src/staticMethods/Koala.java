package staticMethods;
 //we dont have to create object for static method or variable. we can use just class name
public class Koala {
    public static int count = 0;
    public static void setCount(){

    }
     public static void main(String[] args) {
         System.out.println(count);
         Koala k = new Koala();
         System.out.println(k.count);
         k = null;
         System.out.println(k.count); //java does not care that k happens to be null. we will not get Nullexception
     }
}
