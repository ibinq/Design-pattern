package com.ibinq.abstract_factory;

/**
 * Created by Administrator on 2017/4/11.
 */
public interface HumanFactory {
    //制造黄色人种
    public Human createYellowHuman();
    //制造一个白色人种
    public Human createWhiteHuman();
    //制造一个黑色人种
    public Human createBlackHuman();
}
