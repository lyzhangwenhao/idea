package com.tom.spring.annotation;

import org.springframework.stereotype.Component;

/**
 * ClassName: CalculatorImpl
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/5 23:07
 */
@Component
public class CalculatorImpl implements Calculator {
    @Override
    public int add(int i,int j) {
        return i+j;
    }

    @Override
    public int sub(int i,int j) {
        return i-j;
    }

    @Override
    public int mul(int i,int j) {
        return i*j;
    }

    @Override
    public int div(int i,int j) {
        return i/j;
    }
}
