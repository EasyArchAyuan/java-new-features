package com.test;

/**
 * @author Ayuan
 * @Description: 接口中的private方法
 * @date 2022/9/30 11:45
 */
public interface Test {

    //Java8:接口中支持默认实现
    default void test() {
        System.out.println("我是test方法默认实现");
        this.inner();
    }

    //Java9: 接口中可以存在私有方法
    private void inner(){
        System.out.println("我是接口中的私有方法！");
    }
}
