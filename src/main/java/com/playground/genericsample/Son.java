package com.playground.genericsample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Son implements Father {
    public <T extends Sup> T getObjs() {
        return (T) new Sub();
    }

    public List<? extends Sup> getObjList() {
        return new ArrayList<>();
    }

    @Override
    public void setObj(Class<? extends Sup> T) {

    }

    @Override
    public Map<String, Sub> getMap() {
        Map<String, Sub> map =  new HashMap<>();
        map.put("Jack", new Sub());
        return map;
    }

    @Override
    public List<Sub> getList() {
        List<Sub> list = new ArrayList<>();
        list.add(new Sub());
        return list;
    }

    @Override
    public Map<String, List<Sub>> getNestMap() {
        Map<String, List<Sub>> map =  new HashMap<>();
        List<Sub> list = new ArrayList<>();
        list.add(new Sub());
        map.put("Jack", list);
        return map;
    }

    @Override
    public Map<String, List<Sub>> getMapNoGeneric() {
        Map<String, List<Sub>> map =  new HashMap<>();
        List<Sub> list = new ArrayList<>();
        list.add(new Sub());
        map.put("Jack", list);
        return map;
    }

    @Override
    public void addSup(List<? extends Sup> sups) {

    }

    @Override
    public Map<String, List<Sub>> getMixedMap() {
        Map<String, List<Sub>> map =  new HashMap<>();
        List<Sub> list = new ArrayList<>();
        list.add(new Sub());
        map.put("Jack", list);
        return map;
    }


    public void setObj2(Sup sup) {}
}
