package arrayList;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayList {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(); //default numbers of elements
        ArrayList list2 = new ArrayList(10); // specific numbers of slot
        ArrayList list3 = new ArrayList(list2); // a copy of another ArrayList
        //generics = allow specify the type of class that the arrayList will contain

        ArrayList<String> list4 = new ArrayList<String>();
        ArrayList<String> list5 = new ArrayList<>();
        //ArrayList implements an interface called List; ArrayList is a List
        //interfaces cant be instantiated

        List<String> list6 = new ArrayList<>();
        //ArrayList<String> list7 = new List<>(); does not compile
        //ArrayList implements toString


    }
}
