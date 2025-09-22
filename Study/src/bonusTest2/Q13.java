package bonusTest2;

public class Q13 {
    private String name;
    private double weight;
    public Q13(double weight) {
        this("", weight);
        this.weight = weight;
    }
    public Q13(String name, double weight) {
        weight = weight;
        this.name = name;
    }
    public static void main(String[] args) {
        Q13 cub = new Q13(44);
        System.out.println(cub.weight + "" + cub.name);
    }
}
