package com.grechich.com.singleton;

public class Singleton {
    private Singleton singleton;
    private Singleton(){
    }

    public Singleton getSingleton(){
        if (singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
