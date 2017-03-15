package com.ibinq.templet;

/**
 * Created by Administrator on 2017/3/15.
 */
public abstract class Drink {
    public final void prepareDrinkTemplet(){
        //1.将水煮沸
        boilWater();
        //2.泡制饮料
        brew();
        //3.将饮料倒入杯中
        pourInCup();
        if(isWant()){
            //4.加入调料
            addCondiment();
        }
    }

    protected boolean isWant() {
        return true;
    }

    protected  void boilWater(){
        System.out.println("将水煮沸");
    }

    protected  void pourInCup(){
        System.out.println("将水倒入杯中");
    }
    protected abstract void brew();

    protected abstract void addCondiment();

}
