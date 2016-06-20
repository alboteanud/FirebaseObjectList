package com.alboteanu.myapplication;

/**
 * Created by Dan on 20/06/2016.
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton factory(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
