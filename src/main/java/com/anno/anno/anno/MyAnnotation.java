package com.anno.anno.anno;

/**
 * @Author: 曾睿
 * @Date: 2021/3/8 14:50
 */

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
// 元注解之一： 设置注解使用位置
//@Target()
// 元注解（就是加在注解上的注解）之一：设置保留策略：就时说这个注解在什么地方使用，保留到什么为止，后面就会忽视
// SOURCE/ClASS/RUNTIME
// SOURCE：java文件，到class文件的时候就消失了
// ClASS：class文件保留：Lombok这类编译期注解
// RUNTIME: 会加载到jvm内存中保留，一般自己的注解都是运行时使用，获取注解信息
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {

    String getValue() default "no description";

}
