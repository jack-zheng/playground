package com.playground.genericsample;

import java.util.List;
import java.util.Map;

public interface Father {
    <T extends Sup> T getObjs();

    List<? extends Sup> getObjList();

    void setObj(Class<? extends Sup> T);

    Map<String, ? extends Sup> getMap();

    List<? extends Sup> getList();

    <T> Map<String, T> getMixedMap();

    Map<String, ? extends List <? extends Sup>> getNestMap();

    Map<String, ? extends List<? extends Sup> > getMapNoGeneric();

    void addSup(List<? extends Sup> sups);
}
