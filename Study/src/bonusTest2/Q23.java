package bonusTest2;

class Animal {
    public int getAge() {
        return 10;
    }
}
    class Mammal extends Animal{
        protected int getAge(int input){return 7;}
    }
    public class Q23 extends Mammal{
        public boolean hasFur(){return true;}
        public static void main(String[] args) {
            Mammal sloth = new Q23();
            System.out.println(sloth.getAge());
            System.out.println(sloth.getAge(2));
            //System.out.println(sloth.hasFur()); does not compile bcs super class does not have this method
        }
    }

