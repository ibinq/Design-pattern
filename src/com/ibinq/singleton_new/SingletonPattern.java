package com.ibinq.singleton_new;

/**
 * Created by Administrator on 2017/4/11.
 * 通用单例模式
 */
public class SingletonPattern {
    private static final SingletonPattern singletonPattern= new SingletonPattern();
    //限制住不能直接产生  一个实例
    private SingletonPattern(){
    }
    public synchronized static SingletonPattern getInstance(){
        return singletonPattern;
    }
}
