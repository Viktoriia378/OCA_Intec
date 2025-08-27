package polymorphism;

public class Primate {
    public boolean hasHair(){
        return true;
    }
}
interface HasTail{
    public boolean isTailStriped();
}
class Lemur extends Primate implements HasTail{
    public boolean isTailStriped(){
        return false;
    }
    public int age = 10;

    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        System.out.println(lemur.age);
        //System.out.println(lemur.hasHair());

        HasTail hasTail = lemur;
        System.out.println(hasTail.isTailStriped());
        //System.out.println(hasTail.age); does not compile no access

        Primate primate = lemur;
        System.out.println(primate.hasHair());
        //System.out.println(primate.isTailStriped()); does not compile no access

        //casting objects:
        Primate primate1 = lemur;
        //Lemur lemur1 = primate1; does not compile bcs lemur is subclass
        Lemur lemur1 = (Lemur) primate1;
        System.out.println(lemur1.age);
    }
}
