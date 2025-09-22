package bonusTest2;

public class Q39 {
    public static void main(String[] args) {
        Q39 c1 = new Q39();
        Q39 c2 = new Q39();
        c1 = c2;
        c2 = null;
        // garbage collection runs
        c1 = null;
    }
    protected void finalize(Object obj) {
        System.out.println("becomes a butterfly");
    }
}
/*
The finalize() method in Object does not take any parameters.
Since the method defined in Q39 does have a parameter,
it does not override Object’s and is not called during garbage collection.
If the parameter was not in Q39's finalize() method, the answer would be option B.
 */
/*
protected void finalize() throws Throwable
It must be named finalize
It must take zero parameters
It must have the correct signature
 */