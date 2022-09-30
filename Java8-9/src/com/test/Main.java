package com.test;

import java.lang.reflect.Field;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Ayuan
 * @Description: 模块机制
 * @date 2022/9/30 11:28
 */
public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        //1.module-info.java里面导入logging模块才能用
        Logger logger = Logger.getLogger(Main.class.getName());
        logger.log(Level.INFO, "Hello world!");

        //2.通过反射获取JDK提供的类中的字段 但是报错，因为如果模块没有明确授权给其他模块使用反射的权限，那么其他模块是不允许使用反射进行修改的
        Class<String> stringClass = String.class;
        Field field = stringClass.getDeclaredField("value");
        field.setAccessible(true);//private访问权限，修改一下
        System.out.println(field.get("ABCD"));
    }
}
