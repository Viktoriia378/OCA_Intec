package classBuilding.building_blocks;

public class TestThis {
    int x = 5;

    public void doSomething() {
        int x = 10;
        System.out.println(x); // -> 10
        System.out.println(this.x); // -> 5
    }
}
