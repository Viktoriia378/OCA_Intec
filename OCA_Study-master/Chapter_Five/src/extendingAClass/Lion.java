package extendingAClass;

public class Lion extends Animal{
    private void roar(){
        System.out.println("The " + getAge() + " year old lion says: Roar!");
        //we can not use age bcs it is private; it works only with getter
    }
}
