package com.atguigu.java3;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;


/**
 * @author admin
 * @version 1.0.0
 * @ClassName MyAnnotationTest.java
 * @Description
 * @createTime 2022年04月08日 23:23:00
 */
//@SuppressWarnings()
//    @Inherited
@Repeatable(MyAnnotations.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE,TYPE_PARAMETER,TYPE_USE})
public @interface MyAnnotationTest {
    String value() default "hello";
}
