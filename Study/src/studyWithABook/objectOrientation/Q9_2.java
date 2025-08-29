package studyWithABook.objectOrientation;
class BParent {}
class B1Child extends BParent {}
class B2Child extends BParent {}
public class Q9_2 {
    public static void main(String args[]){
        BParent b = new BParent();
        B1Child b1 = new B1Child();
        B2Child b2 = new B2Child();

        //b = b1; // ✅ OK — upcasting: B1 → B
        //b2 = b; ❌ does not Compile — ты пытаешься B → B2 без кастинга (downcast, и то не факт что b — это B2)
        b1 = (B1Child) b;   // ⚠️ Runtime exception — если b НЕ был создан как B1
        //b2 = (B2Child) b1;  // ❌ does not compile — b1 это B1, ты не можешь кастовать B1 → B2 (брать брата и говорить, что он сестра)
        //b1 = (BParent) b1;   // does not compile — ты сначала понижаешь B1 → B (upcast), а потом обратно.
}}
