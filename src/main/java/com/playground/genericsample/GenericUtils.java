package com.playground.genericsample;

import java.util.HashMap;
import java.util.Map;

public class GenericUtils {
    public <T> Map<String, ? extends Sup> getGenericMap() {
        return new HashMap<>();
    }
    public static <T> void printParam(T t) {
        System.out.println(t);
    }
}
