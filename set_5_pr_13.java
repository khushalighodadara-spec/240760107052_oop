
package apack;

public class A {
    public int pubVar;
    protected int protVar;
    private int privVar;
    public A(int pub, int prot, int priv) {
        pubVar = pub;
        protVar = prot;
        privVar = priv;
    }
    public int getPrivVar() {
        return privVar;
    }
}
package bpack;

import apack.A;

public class B extends A {

    public B(int pub, int prot, int priv) {
        super(pub, prot, priv);
    }

    public void display() {
        System.out.println("Inside Class B (Subclass of A):");
        System.out.println("Public Variable: " + pubVar);
        System.out.println("Protected Variable: " + protVar);

        System.out.println("Private Variable cannot be accessed directly");
    }
}
package cpack;

import apack.A;

public class C {

    public void display() {
        A obj = new A(10, 20, 30);

        System.out.println("Inside Class C (Non-Subclass):");
        System.out.println("Public Variable: " + obj.pubVar);

        System.out.println("Protected Variable cannot be accessed");
        System.out.println("Private Variable cannot be accessed");
    }
}
package dpack;

import bpack.B;
import cpack.C;

public class ProtectedDemo {
    public static void main(String[] args) {

        B b = new B(100, 200, 300);
        C c = new C();

        b.display();
        System.out.println();

        c.display();
    }
}

/*
Expected Output:

Inside Class B (Subclass of A):
Public Variable: 100
Protected Variable: 200
Private Variable cannot be accessed

Inside Class C (Non-Subclass):
Public Variable: 10
Protected Variable cannot be accessed
Private Variable cannot be accessed
*/
