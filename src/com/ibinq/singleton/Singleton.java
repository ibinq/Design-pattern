package com.ibinq.singleton;

/**
 * Created by Bing on 2017/3/15.
 * 单例模式
 * 应用场合：有些对象只需要一个就够了，比如古代的皇帝，老婆等
 * 作用：保证整个应用程序中某个实例有且只有一个
 * 类型：饿汉模式，懒汉模式
 * 区别：
 *      1.饿汉模式的特点是加载的时候比较慢，但运行时获取对象的速度比较快，线程安全
 *      2.懒汉模式的特点是记载的时候比较快，但运行时获取对象的速度比较慢，线程不安全
 *
 * 饿汉模式
 */

public class Singleton {
    //1.将构造方法私有化，不允许外界直接创建对象
    private Singleton(){}

    //2.创建类的唯一实例，试用private static修饰
    private static Singleton instance = new Singleton();

    //3.提供一个获取实例的方法，试用public static 修饰
    public static Singleton getInstance(){
        return instance;
    }

}
