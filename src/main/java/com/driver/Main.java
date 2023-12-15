package com.driver;

class A{
    public String meth(){
        return "Invoking method from class A";
    }

}
class B extends  A {
    public String meth(){
        return "Method is Overridden in Extended Class B";
    }
}
public class Main {



    public static void main(String[] args) {
              B obj=new B();
              System.out.println(obj.meth());
    }
}
