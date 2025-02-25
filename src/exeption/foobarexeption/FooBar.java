package exeption.foobarexeption;

public class FooBar extends FooBarException{
    String message;
    public FooBar(String message) {
        this.message = message;
    }
}
