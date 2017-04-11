package com.ibinq.abstract_factory;

/**
 * Created by Administrator on 2017/4/11.
 */
public enum HumanEnum {
    //把世界上所有人类型都定义出来
    YelloMaleHuman("com.ibinq.abstract_factory.YellowMaleHuman"),
    YelloFemaleHuman("com.ibinq.abstract_factory.YellowFemaleHuman"),
    WhiteFemaleHuman("com.ibinq.abstract_factory.WhiteFemaleHuman"),
    WhiteMaleHuman("com.ibinq.abstract_factory.WhiteMaleHuman"),
    BlackFemaleHuman("com.ibinq.abstract_factory.BlackFemaleHuman"),
    BlackMaleHuman("com.ibinq.abstract_factory.BlackMaleHuman");

    private String value = "";
    //定义构造函数，目的是Data(value)类型的相匹配
    private HumanEnum(String value){
        this.value = value;
    }
    public String getValue(){
        return this.value;
    }
    /*
    * java enum类型尽量简单使用，尽量不要使用多态、继承等方法
    * 毕竟用Clas完全可以代替enum
    */
}
