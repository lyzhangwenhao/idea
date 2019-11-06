package com.tom.springtest.test;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Field;
import java.util.ArrayList;


class TestApplicationTests {

    @Test
    void contextLoads() throws NoSuchFieldException, IllegalAccessException, InstantiationException {

        Demo1 d = new Demo1();

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);

        Class<? extends ArrayList> c = list.getClass();
        Field[] cc = c.getDeclaredFields();
        for (Field f:cc){
            f.setAccessible(true);
            Object o = f.get(list);
            System.out.println(f.getName()+"   "+o);
        }

    }

}
