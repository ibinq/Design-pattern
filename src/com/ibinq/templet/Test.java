package com.ibinq.templet;

/**
 * Created by Bing on 2017/3/15.
 * 模板方法模式
 */
public class Test {
    public static void main(String[] args){
        Drink d1  = new Tea();
        d1.prepareDrinkTemplet();

        System.out.println("*************************");

        Drink d2  = new Coffee();
        d2.prepareDrinkTemplet();

    }
}
