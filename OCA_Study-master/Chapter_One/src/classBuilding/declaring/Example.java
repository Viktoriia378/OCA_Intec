package classBuilding.declaring;

public class Example {
    public static void main(String[] args) {
        String s1,s2;
        String s3 = "yes" + 5, s4 = "no";
        s3 = 's' + "d";

        int i1, i2, i3 = 5; // only i3 initialized
        i1 = i2 = i3;
        System.out.println(i1);

    }
}
