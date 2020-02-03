package com.slk.lazy;
//懒汉式单例
//在外部需要使用的时候才进行实例化
public class LazySimpleSingleton {

    private LazySimpleSingleton(){ }
    private static LazySimpleSingleton lazySimpleSingleton=null;

    public  static LazySimpleSingleton getInstance(){
        synchronized(LazySimpleSingleton.class){
            if(lazySimpleSingleton==null){

                lazySimpleSingleton=new LazySimpleSingleton();
            }
        }

        return lazySimpleSingleton;
    }
}
