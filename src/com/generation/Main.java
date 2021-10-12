package com.generation;

public class Main {

    public static void main(String[] args) {
        boolean X = true;
        boolean Z = true;
        boolean Y = false;

        System.out.println("A) " + ((X && Y) || (X && Z) ));
        System.out.println("B) " + ((X || !Y) && (!X || Z)));
        System.out.println("C) " + (X || Y && Z  ));
        System.out.println("D) " + (!(X || Y) && Z ));
        System.out.println("E) " + (X || Y || X && !Z && !Y  ));
        System.out.println("F) " + (!X || !Y || Z && X && !Y));
	/*
        a) true     :)
        b) true     :)
        c) true     :)
        d) false    :)
        e) false    :(
        f) true     :)
    */

        //Mi error viene de que no todos tienen la misma jerarquía, se hace primero las negaciones, luego los ands y al final los ors.
    }
}
