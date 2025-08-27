package bonusTest1;

interface WaterFowl{}
class Bird{}
public class Q5 extends Bird implements WaterFowl{
    public void quack(){
        System.out.println("quack!");
    }

    public static void main(String[] args) {
        //Object object = new Q5();
        //Q5 duck  = (Q5) object;
        //duck.quack();
        Object object = (Object) new Bird(); //creating object class Bird (the object instance of Bird)
        Q5 duck = (Q5) object; //object was created like new Bird() not new Q5()
        duck.quack();
    }
}
