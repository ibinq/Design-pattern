package com.ibinq.singleton;

/**
 * Created by Bing on 2017/3/15.
 *懒汉模式
 */

public class Singleton2 {
    //1.将构造方法私有化，不允许外界直接创建对象
    private Singleton2(){}

    //2.创建类的唯一实例，试用private static修饰
    private static Singleton2 instance ;

    //3.提供一个获取实例的方法，试用public static 修饰
    public static Singleton2 getInstance(){
        if(instance == null){
            instance = new Singleton2();
        }
        return instance;
    }

}
