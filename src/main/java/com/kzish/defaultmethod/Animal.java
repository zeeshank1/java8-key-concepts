package com.kzish.defaultmethod;

public interface Animal {

    void type();

    static void color(){
        System.out.println("Animal Interface static color()");
    }

    default void eat(){
        System.out.println("Animal Interface default eat()");
    }
}
