package com.ibinq.abstract_factory;

/**
 * Created by Administrator on 2017/4/11.
 */
public abstract class AbstractBlackHuman implements Human {
    public void cry() {
        System.out.println("黑人会哭");
    }
    public void laugh() {
        System.out.println("黑人会笑");
    }
    public void talk() {
        System.out.println("黑人可以说话，一般人听不懂");
    }
}
