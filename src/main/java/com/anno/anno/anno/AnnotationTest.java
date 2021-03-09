package com.anno.anno.anno;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 获取注解上信息，其实就是通过反射获取，另外其实编译器也可以获取，就像lombok和@Override注解，
 * 编译器编译的时候检查使用
 * @Author: 曾睿
 * @Date: 2021/3/8 14:58
 */
public class AnnotationTest {
    public static void main(String[] args) throws Exception {

        // 选择类
        Class<Demo> clazz = Demo.class;
        // 01、获取类上的注解
        MyAnnotation annotationOnClass = clazz.getAnnotation(MyAnnotation.class);
        System.out.println(annotationOnClass.getValue());

        // 选择类的成员变量
        Field name = clazz.getField("name");
        // 02、获取成员变量上的注解
        MyAnnotation annotationOnField = name.getAnnotation(MyAnnotation.class);
        System.out.println(annotationOnField.getValue());

        // 选择方法
        Method hello = clazz.getMethod("hello", (Class<?>[]) null);
        // 03、获取hello方法上的注解
        MyAnnotation annotationOnMethod = hello.getAnnotation(MyAnnotation.class);
        System.out.println(annotationOnMethod.getValue());

        // 选择方法
        Method defaultMethod = clazz.getMethod("defaultMethod", (Class<?>[]) null);
        // 04、获取defaultMethod方法上的注解
        MyAnnotation annotationOnDefaultMethod = defaultMethod.getAnnotation(MyAnnotation.class);
        System.out.println(annotationOnDefaultMethod.getValue());

    }
}
