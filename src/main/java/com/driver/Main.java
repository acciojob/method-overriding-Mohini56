package com.driver;

// Task 1: Create a class A with a method named meth
class A {
    public String meth() {
        return "Invoking method from class A";
    }
}

// Task 2: Create a class B which extends class A
class B extends A {
    
    // Task 4: Override the method in class B
    @Override
    public String meth() {
        return "Method is overridden in Extended class B";
    }
}

public class Main {

    public static void main(String[] args) {
       
        A obj = new A();
        System.out.println(obj.meth());
       
        A obj1 = new B();
        System.out.println(obj1.meth());
    }
}
