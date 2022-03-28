package com.atguigu.exer;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName EcDef.java
 * @Description TODO
 * @createTime 2022年03月27日 22:51:00
 */
public class EcDef extends Exception{

    static final long serialVersionUID= -33875169931249948L;


    public EcDef() {
    }

    public EcDef(String message) {
        super(message);
    }
}
