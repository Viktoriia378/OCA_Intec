package overridingMethods;

public class Wolf extends Canine{
    public double getAverageWeight() {
        return super.getAverageWeight() + 20; //return getAverageWeight()+20;  // INFINITE LOOP
    }
}

