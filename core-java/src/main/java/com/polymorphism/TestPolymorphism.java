package com.polymorphism;

public class TestPolymorphism {

    public static void main(String[] args) {
        Class3 obj1 = new Class3();
        Class4 obj2 = new Class4();
        Class3 obj3 = new Class4();
        obj1.method1(1);
        obj2.method1(1);
        obj3.method1(1);
        obj2.method1(1, 2);
    }
}
