package test;
class HasSoreThroatException extends Exception {}
class TiredException extends RuntimeException {}
public interface Roar {
    void roar() throws HasSoreThroatException;
}
class Lion implements Roar {
    public void roar() throws HasSoreThroatException{}
}
