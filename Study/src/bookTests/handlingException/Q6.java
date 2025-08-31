package bookTests.handlingException;

public class Q6 {
    /*
    There are multiple view points regarding checked and and unchecked exceptions. As per the official Java tutorial
    ( http://docs.oracle.com/javase/tutorial/essential/exceptions/runtime.html ) :  If a client can reasonably
    be expected to recover from an exception, make it a checked exception. If a client cannot do anything to recover from the exception,
     make it an unchecked exception.
Here, the client basically means the caller of a method.

Another way to look at exceptions is to see the cause of the exception in terms of whether
it is internal or external to the program's code. For example, an incorrectly written code may try to access
a reference pointing to null, or it may try to access an array beyond its length. These are internal sources of exception.
Here, using runtime exceptions is appropriate because ideally these problems should be identified while testing and should
not occur when the program is ready for deployment.

On the other hand, a program interacting with files may not be able to do its job at all if a file is not
available but it should anticipate this situation. This is an external source of an exception and has nothing to do with
a program's code as such. It is therefore appropriate to use a checked exception here.
     */
}
/*
exceptional conditions external to an application that a well written application should anticipate and from which it can recover.
Note that here recovery doesn't necessarily mean to keep functioning normally. It means that the program shouldn't just crash.
If it absolutely cannot proceed, it should notify the user appropriately and then end gracefully
 */
