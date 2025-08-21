package test;

public class Question11 {
    public static void swing() {
        System.out.print("swing ");
    }

    public void climb() {
        System.out.println("climb ");
    }

    public void play() {
        swing();
    //    climb(); only 1 compile error
    }

    public static void main(String[] args) {
        Question11 rope = new Question11();
        rope.play();
        Question11 rope2 = null;
        rope2.play();
    }
}
