package studyWithABook.assignments;

public class Q16 {
    private Object o;
    void doSomething(Object s) {
        o = s;
    }

    public static void main(String[] args) {
        Object obj = new Object(); // 1
        Q16 tc = new Q16(); //2
        tc.doSomething(obj); //3
        obj = new Object();    //4
        obj = null;    //5
        tc.doSomething(obj); //Before this line the object is being pointed to by at least one variable
    }

}
/*
1. An object can be made eligible for garbage collection by making sure there are no references pointing to that object.
2. You cannot directly invoke the garbage collector. You can suggest the JVM to perform garbage collection by calling System.gc();
 */