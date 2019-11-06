package com.tom.spring.proxy;

/**
 * ClassName: Calculator
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/5 23:04
 */
public interface Calculator {
    /**
     * 加法
     * @return
     */
    public int add(int i,int j);
    /**
     *  减法
     * @return
     */
    public int sub(int i,int j);
    /**
     *  乘法
     * @return
     */
    public int mul(int i,int j);
    /**
     *  除法
     * @return
     */
    public int div(int i,int j);
}
