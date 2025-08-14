package classBuilding.package_example;
//import java.lang.System;
//import java.lang.*;


import java.util.Random;

public class ImportExample {
    public static void main (String[] args) {
        Random r = new Random();
        System.out.println(r.nextInt(10));

        // java.lang - autoimport we don't have to add it
    }
}
