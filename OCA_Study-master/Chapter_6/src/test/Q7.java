package test;

    public class Q7{
        public void go(){
            System.out.println("a");
            try{
                stop();
            } catch (ArithmeticException e){
                System.out.println("B");
            }finally {
                System.out.println("c");
            }
            System.out.println("d");
        }
        public void stop(){
            System.out.println("e");
            Object x = null;
            x.toString();
            System.out.println("f");
        }

        public static void main(String[] args) {
            new Q7().go();
        }
    }

