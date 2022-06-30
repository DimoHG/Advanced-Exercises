package com.softuni.testAccessModifiers.childAndParent;

public class Child extends Parent {
//    private String privateProperty;
//    public String publicProperty;
//    protected String protectedProperty;
//
//    public void jump(){
//        System.out.println("Jumping");
//    }
    public void print() {
        System.out.println(this.publicProperty);
        System.out.println(this.protectedProperty);
    }
}
