package com.tom.springtest.test;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayList;

/**
 * ClassName: Demo1
 * Description:
 *
 * @date 2019/11/4 0:33
 * @author: Mi_dad
 */
public class Demo1 extends ArrayList {
    protected int a;

    //protected transient int b ;

    /**
     * {@inheritDoc}
     *
     * @param index
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
