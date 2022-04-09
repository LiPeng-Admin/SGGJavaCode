package com.atguigu.java3;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName MyAnnotations.java
 * @Description TODO
 * @createTime 2022年04月09日 15:47:00
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE,TYPE_PARAMETER,TYPE_USE})
public @interface MyAnnotations {
    MyAnnotationTest [] value();
}
