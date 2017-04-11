package com.ibinq.strategy;

/**
 * Created by Administrator on 2017/4/11.
 */
public class GivenGreenLight implements IStrategy {
    @Override
    public void operate() {
        System.out.println("求吴国太开个绿灯，放行");
    }
}
