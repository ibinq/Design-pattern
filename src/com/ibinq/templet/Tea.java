package com.ibinq.templet;

/**
 * Created by Administrator on 2017/3/15.
 */
public class Tea extends Drink {
    @Override
    protected void brew() {
        System.out.println("用80度热水冲泡茶叶");
    }

    @Override
    protected void addCondiment() {
        System.out.println("加入柠檬");
    }

    @Override
    protected boolean isWant() {
        return false;
    }
}
