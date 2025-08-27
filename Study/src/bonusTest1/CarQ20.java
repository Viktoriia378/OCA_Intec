package bonusTest1;

public class CarQ20 {
    public int velocity = 10;
}
class TestDrive{
    public static void go(CarQ20 c){
        c.velocity += 10;
    }

    public static void main(String[] args) {
        CarQ20 porsche = new CarQ20(); // velocity = 10
        go(porsche);  // velocity += 10 → 20

        CarQ20 stolen = porsche;// stolen и porsche указывают на один объект
        go(stolen);// velocity += 10 → 30

        System.out.println(porsche.velocity);// 30
    }
}
