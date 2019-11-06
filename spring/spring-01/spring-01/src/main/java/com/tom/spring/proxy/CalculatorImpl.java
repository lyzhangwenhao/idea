package com.tom.spring.proxy;

/**
 * ClassName: CalculatorImpl
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/5 23:07
 */
public class CalculatorImpl implements Calculator {
    @Override
    public int add(int i,int j) {
        int result = i+j;
        return result;
    }

    @Override
    public int sub(int i,int j) {
        int result = i-j;
        return result;
    }

    @Override
    public int mul(int i,int j) {
        int result = i*j;
        return result;
    }

    @Override
    public int div(int i,int j) {
        int result = i/j;
        return result;
    }
}
