package questions;

public class App {
    String greet = "Welcome";

    public App() {
        String greet = "Hello";
    }

    public void setGreet() {
        String greet = "Good Day";
    }

    public static void main(String[] args) {
        App t = new App();
        String greet = "LUCK";
        System.out.println(t.greet);
//117
        String ta="a";
        ta=ta.concat("b");
        String tb="c";
        ta=ta.concat(tb);
        ta.replace('c','d'); //carefully!!!
        ta=ta.concat(tb);
        System.out.println(ta);

    }
}
