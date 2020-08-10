package com.playground.genericsample;

import com.sun.xml.internal.ws.api.message.HeaderList;
import org.testng.annotations.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.Supplier;

public class SonTest {
    @Test
    public void test_set() {
        Son son = new Son();
        son.setObj2(new Sub());
    }

    @Test
    public void test_getMap() {
        Map<String, Sub> map = (new Son()).getMap();
        System.out.println(map.keySet().size());
    }

    @Test
    public void test_list_hierarcy() {
        List<Sub> subs = new ArrayList<>();
//        List<Sup> sup = subs;
        subs.add(new Sub());
        (new Son()).addSup(subs);
    }

    @Test
    public void test_assign() {
        List<List<?>> theAnyList = new ArrayList<>();
        theAnyList.add(new ArrayList<String>());
        theAnyList.add(new LinkedList<Integer>());
    }

    @Test
    public void test_supplier() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        Supplier<LocalDateTime> s = LocalDateTime::now;
        System.out.println(s.get());

        Supplier<String> s1 = () -> dtf.format(LocalDateTime.now());
        System.out.println(s1.get());

//        Random random = new Random();
//        for (int i = 0; i < 10; i++) {
//            System.out.println(random.nextInt());
//        }

        System.out.println("Supplier Sample...");
        Supplier<Integer> integerSupplier = () -> (new Random()).nextInt();
        System.out.println(integerSupplier.get());
    }
}