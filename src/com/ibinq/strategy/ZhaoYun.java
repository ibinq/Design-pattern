package com.ibinq.strategy;

/**
 * Created by Administrator on 2017/4/11.
 */
public class ZhaoYun {
    public static void main(String[] args) {
        Context context ;

        //刚刚到吴国，拆第一个
        System.out.println("-------------到吴国拆第一个--------------");
        context = new Context(new BackDoor());//拿到妙计
        context.operate();//拆开执行
        System.out.println("\n\n\n\n\n\n");

        //刘备乐不思蜀，拆第二个
        System.out.println("-------------刘备乐不思蜀，拆第二个--------------");
        context = new Context(new GivenGreenLight());//拿到妙计
        context.operate();//拆开执行
        System.out.println("\n\n\n\n\n\n");

        //孙权的小兵追了，咋办？拆第三个
        System.out.println("-------------孙权的小兵追了，咋办？拆第三个--------------");
        context = new Context(new BlockEnemy());//拿到妙计
        context.operate();//拆开执行
        System.out.println("\n\n\n\n\n\n");
    }
}
