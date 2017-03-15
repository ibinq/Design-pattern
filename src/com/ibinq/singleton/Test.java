package com.ibinq.singleton;

/**
 * Created by Bing on 2017/3/15.
 */
public class Test {
    public static void main(String[] args){
        //饿汉模式
        Singleton s11 = Singleton.getInstance();
        Singleton s22 = Singleton.getInstance();

        if(s11 == s22){
            System.out.print("s1和s2是同一个实例");
        }else{
            System.out.print("s1和s2不是同一个实例");
        }

        //懒汉模式
        Singleton2 s3 = Singleton2.getInstance();
        Singleton2 s4 = Singleton2.getInstance();

        if(s3 == s4){
            System.out.print("s3和s4是同一个实例");
        }else{
            System.out.print("s3和s4不是同一个实例");
        }
    }
}
