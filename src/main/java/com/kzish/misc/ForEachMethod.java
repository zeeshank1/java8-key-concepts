package com.kzish.misc;

import java.util.Arrays;
import java.util.List;

public class ForEachMethod {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        //External For Loops

        //1. classic for loop : for(int i =0,....)
        //2. Enhance for loop : for(int i : list)

        //Internal Loop started from java 8
        //Its faster
        integerList.forEach(item -> System.out.println(item));

    }

}
