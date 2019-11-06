package com.tom.spring.entity;

/**
 * ClassName: TestBean
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/5 14:59
 */
public class TestBean {
    private Integer id;
    private String name;

    public TestBean(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public TestBean() {
        System.out.println("===>1.调用构造器创建bean对象");
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        System.out.println("===>2.调用set方法给对象属性赋值");
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TestBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    /**
    *   初始化方法
     * */
    public void init(){
        System.out.println("===>3.调用初始化方法");
    }
    /**
    *   调用销毁方法
    * */
    public void destroy(){
        System.out.println("===>5.调用销毁方法");
    }
}
