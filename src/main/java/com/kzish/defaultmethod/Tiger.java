package com.kzish.defaultmethod;

public class Tiger implements Animal {
    @Override
    public void type() {
        System.out.println("Overridden type() in tiger class");
    }

    public static void main(String[] args) {
        Animal animal = new Tiger();

        animal.type();
        Animal.color();
        animal.eat();
    }
}
