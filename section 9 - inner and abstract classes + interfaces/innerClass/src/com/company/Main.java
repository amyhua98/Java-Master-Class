package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


class Main {
    public static void main(String[] args) throws InterruptedException {

        class MyClass {
            public void printMe(Object o) {
                System.out.println("Hello "+o);
            }

            public void printMe(String o) {
                System.out.println(100+o);
            }

            public void printMe(Integer o) {
                System.out.println(o);
            }
        }
        MyClass my = new MyClass();
        my.printMe("Java");
    }
}