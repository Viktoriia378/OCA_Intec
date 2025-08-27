package test;

import interfaceCreation.abstractMethodsAndMultipleInheritance.theSameNameOfMethods.Herbivore;

public interface HasVocalCords {
    public abstract void makeSound();
}
interface CanBark extends HasVocalCords{
    public void bark();
}
class Pig implements HasVocalCords{

    @Override
    public void makeSound() {

    }
}
