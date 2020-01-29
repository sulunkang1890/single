package com.slk.hungry;


public class HungaryStaticSingleton {
    private static final HungaryStaticSingleton hungrySingleton;
    static {
        hungrySingleton = new HungaryStaticSingleton();
    }
    private HungaryStaticSingleton(){}
    public static HungaryStaticSingleton getInstance(){
        return  hungrySingleton;
    }
}