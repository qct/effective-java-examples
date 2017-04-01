package org.effectivejava.examples.chapter10.item67;

/**
 * <p>Created by Damon.Q on 2017/4/1.
 */
public class TestBitWise {

    public static void main(String[] args) {
        if(m1() && m2()) {
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }

    static boolean m1(){
        System.out.println("m1111.");
        return false;
    }

    static boolean m2(){
        System.out.println("m2222.");
        return false;
    }
}
