package bookTests.workingWithInheritance.p2;

import bookTests.workingWithInheritance.p1.Movable;

public class Donkey implements Movable {
    int location = 200;
    public void move(int by){location = location + by;}
    public void moveBack(int by) {location = location-by;}
}
