package com.playground.genericsample;

import org.testng.annotations.Test;

public class SonTest {
    @Test
    public void test_set() {
        Son son = new Son();
        son.setObj2(new Sub());
    }
}