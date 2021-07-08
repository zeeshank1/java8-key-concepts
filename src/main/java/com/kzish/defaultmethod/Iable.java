package com.kzish.defaultmethod;

public interface Iable {
    default void show() {
        System.out.println("Show of Interface I");
    }
}
