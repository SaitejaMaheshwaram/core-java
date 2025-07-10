package com.polymorphism;

public class Class4 extends Class3{

    // dynamic polymorphism - overriding
    @Override
    public void method1(int j) {
        j = j+10;
        System.out.println(j);
    }

    // static polymorphism - overloading
    public void method1(int i, int j) {
        int result = i+j;
        System.out.println(result);
    }
}
