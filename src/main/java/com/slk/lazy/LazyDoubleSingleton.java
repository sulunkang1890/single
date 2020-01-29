package com.slk.lazy;

public class LazyDoubleSingleton {
    private LazyDoubleSingleton (){}

    private static LazyDoubleSingleton lazyDoubleSingleton=null;

    /**
     * 懒汉模式采用双重锁
     * @return
     */
    public static LazyDoubleSingleton getInstance(){
        if(lazyDoubleSingleton==null){
            synchronized (LazyDoubleSingleton.class){
                if(lazyDoubleSingleton==null){
                    lazyDoubleSingleton=new LazyDoubleSingleton();
                    //1.分配内存给这个对象
                    //2.初始化对象
                    //3.设置lazy指向刚分配的内存地址
                    //4.初次访问对象
                }
            }
        }
        return lazyDoubleSingleton;
    }
}
