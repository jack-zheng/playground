package com.playground.genericsample;

import java.util.ArrayList;
import java.util.List;

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

    public void setObj2(Sup sup) {}
}
