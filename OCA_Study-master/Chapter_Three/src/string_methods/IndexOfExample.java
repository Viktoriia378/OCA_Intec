package string_methods;

public class IndexOfExample {
    public static void main(String[] args) {
        //int indexOf(char ch)
        //int indexOf(char ch, index fromIndex)
        //int indexOf(String str)
        //int index(String str, index fromIndex)
        //indexOf throws -1 if match was not found

        String string = "animals";
        System.out.println(string.indexOf('a')); // 0
        System.out.println(string.indexOf("al")); //4
        System.out.println(string.indexOf('a', 4));//4
        System.out.println(string.indexOf("al", 5));//-1 does not throw exception
    }
}
