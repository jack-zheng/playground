package com.playground.genericsample;

import java.util.List;

public interface Father {
    <T extends Sup> T getObjs();

    List<? extends Sup> getObjList();

    void setObj(Class<? extends Sup> T);
}
