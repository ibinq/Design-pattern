package com.ibinq.strategy;

/**
 * Created by Administrator on 2017/4/11.
 */
public class Context {

    //构造函数，你要使用那条妙计
    private IStrategy strategy;
    public Context(IStrategy strategy){
        this.strategy = strategy ;
    }

    //使用计谋了，看我出招
    public void operate(){
        this.strategy.operate();
    }
}
