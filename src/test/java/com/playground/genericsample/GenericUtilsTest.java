package com.playground.genericsample;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class GenericUtilsTest {

    @Test
    public void test_print() {
        GenericUtils.printParam("Jack");
        GenericUtils.printParam(1);
    }
}