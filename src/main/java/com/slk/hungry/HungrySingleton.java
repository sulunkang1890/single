package com.slk.hungry;


//单例模式  饿汉模式

/**
 * 1.单例模式主要是将构造函数私有。
 * 2.单例模式 饿汉模式 优点 （1）不需要加任何锁 执行效率高 （2）用户体验较好
 *                           (3)绝对线程安全，在线程还没出现以前就是实例化了，不可能存在访问安全问题
 *                     缺点 （1） 类加载的时候就初始化，占用空间  占用了内存
 *
 */
public class HungrySingleton {
    private static  final  HungrySingleton hungrySingleton=new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return  hungrySingleton;
    }



}
