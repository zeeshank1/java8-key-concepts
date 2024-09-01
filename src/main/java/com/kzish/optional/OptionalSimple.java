package com.kzish.optional;


import java.util.Optional;

public class OptionalSimple {

    public static void main(String[] args) {
        Optional<String> vehicle = Optional.of("BIKE");
        String answerOne = "YES";
        String answerTwo = null;

        System.out.println("Non-empty optional   : " + vehicle);
        System.out.println("Non-empty optional 1 : " + vehicle.get());
        System.out.println("Empty check          : " + vehicle.orElse("NONE"));
        System.out.println("Without null         : " + Optional.of(answerOne));
        System.out.println("Of Nullable          : " + Optional.ofNullable(answerTwo));
        System.out.println("Without null 2       : " + Optional.of(answerTwo));
    }
}
