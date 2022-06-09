package com.softuni;

public class Node {
    int value; // стойността
    Node next; // сочи към следващата кутийка
    Node prev; // сочи към предишната кутийка

    public Node(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value + "";
    }
}
