package polymorphism.casting;

public class Rodent {
}
class Capybara extends Rodent{
    public static void main(String[] args) {
        Rodent rodent = new Capybara();
        Capybara capybara = (Capybara) rodent;

        Rodent rodent1 = new Rodent();
        Capybara capybara1 = (Capybara) rodent1; //ClassCastException

    }
}
