package classBuilding.building_blocks;

public class Shadowing {
    static int x = 10;

    public static void main(String[] args) {
        int x1 = 5;
        x1 += 3.5;
        System.out.println(x1);

        int x= 20;
        {
            //int x = 30;
            //System.out.println(x);
        }
        System.out.println(Shadowing.x);
    }

}
