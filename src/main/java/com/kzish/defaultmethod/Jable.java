package com.kzish.defaultmethod;

public interface Jable {
    default void show(){
        System.out.println("Show method of Interface Jable");
    }
}
