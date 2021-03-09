package com.anno.anno.anno;

/**
 * @Author: 曾睿
 * @Date: 2021/3/8 14:57
 */
@MyAnnotation(getValue = "annotation on class")
public class Demo {

    @MyAnnotation(getValue = "annotation on field")
    public String name;

    @MyAnnotation(getValue = "annotation on method")
    public void hello() {}

    @MyAnnotation() // 故意不指定getValue
    public void defaultMethod() {}
}
