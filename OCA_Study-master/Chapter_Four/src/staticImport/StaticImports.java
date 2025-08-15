package staticImport;

import java.util.List;
import static java.util.Arrays.asList;

public class StaticImports {
    public static void main(String[] args) {
        List<String> list = asList("one", "two"); // we dont have to write Array.asList bcs we have static import
        list.size();
        System.out.println(list);

        //import static java.util.Arrays; does not compile
        //import static java.util.Arrays.asList;
        //static import java.util.Arrays.*; does not compile
        //if we used static import for asList - Arrays.asList will not compile

        //import static statics.A.Type;
        //import static statics.B.Type; does not compile bcs the same names of classes
    }
}
