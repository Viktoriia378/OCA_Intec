package bookTests.lambda;

import java.util.*;

public class Q4 {
    int value;
    Q4(int value) {
        this.value = value;
    }

    public String toString() {
        return "" + value;
    }

    public static void main(String[] args) {
        Q4[] dataArr = new Q4[]{new Q4(1), new Q4(2),
                new Q4(3), new Q4(4)};

        List<Q4> dataList = Arrays.asList(dataArr); //1

        for (Q4 element : dataList) {

            dataList.removeIf((Q4 d) -> {
                return d.value % 2 == 0;
            });  //2

            //System.out.println("Removed " + d + ", "); //3
        }
//Line at //3 will cause compilation failure because the lambda variable d is available only within the lambda body. It is not available at //3.
    }}
/*
1. Observe that the loop is completely unnecessary. The Collection's removeIf method takes a Predicate and removes
all elements of the List for which the Predicate returns true. You need not put it in a loop to check for each element.

2. If you remove //3, the code will compile but will throw a java.lang.UnsupportedOperationException at run time.
Since the list is backed by an array and the size of the array cannot change, you cannot add or remove elements from a List backed by an array.
You may, however, change the elements of the List using list.set(index, element); method.
 */