package com.ibinq.templet;

/**
 * Created by Administrator on 2017/3/15.
 */
public class Coffee extends Drink {
    @Override
    protected void brew() {
        System.out.println("用沸水冲泡咖啡");
    }

    @Override
    protected void addCondiment() {
        System.out.println("加入糖和牛奶");
    }
}
