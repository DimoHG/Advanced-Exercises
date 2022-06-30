package com.softuni.testAccessModifiers.childAndParent;

public class Parent {
    private String privateProperty;
    public String publicProperty;
    protected String protectedProperty;
    String defaultProperty;

    public void jump(){
        System.out.println("Jumping");
    }
}
