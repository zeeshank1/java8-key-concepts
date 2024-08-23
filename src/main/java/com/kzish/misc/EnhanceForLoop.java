package com.kzish.misc;

import java.util.Arrays;
import java.util.List;

public class EnhanceForLoop {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        //External For Loops
        for(int i: integerList){
            System.out.println(i);
        }

    }
}
