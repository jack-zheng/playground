package com.playground.anno;

import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class PersonTest {
    @Test
    public void test_print_by_anno() {
        Method[] methods = Person.class.getDeclaredMethods();
        for (Method m : methods) {
            Marked myAnno = m.getAnnotation(Marked.class);
            if (myAnno != null) {
                System.out.println("Method: " + m.getName() + " has marked annotation.");
                System.out.println("Marked value: " + myAnno.value());
            } else {
                System.out.println("Method: " + m.getName() + " don't has marked annotation.");
            }
        }
    }
}