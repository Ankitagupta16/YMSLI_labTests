package com.singletonDesignPattern;

import java.io.Serializable;

public class SingletonUsingSerializationIssue implements Serializable{
	private static final long serialVersionUID = -7604766932017737115L;

    private SingletonUsingSerializationIssue(){}
    
    private static class Singleton{
        private static final  SingletonUsingSerializationIssue instance = new  SingletonUsingSerializationIssue();
    }
    
    public static SingletonUsingSerializationIssue getInstance(){
        return Singleton.instance;
    }
	
    

    
}
