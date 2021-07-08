package com.kzish.defaultmethod;

public class IableJableChild implements Iable,Jable{
    public void show(){
        System.out.println("show method of child class");
    }

    public static void main(String[] args) {
        IableJableChild iableJableChild = new IableJableChild();
        iableJableChild.show();
    }
}
