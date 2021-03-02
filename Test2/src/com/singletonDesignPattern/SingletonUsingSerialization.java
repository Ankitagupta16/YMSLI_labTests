package com.singletonDesignPattern;

import java.io.Serializable;

public class SingletonUsingSerialization implements Serializable{
	private static final long serialVersionUID = -7604766932017737115L;

    private SingletonUsingSerialization(){}
    
    private static class Singleton{
        private static final  SingletonUsingSerialization instance = new  SingletonUsingSerialization();
    }
    
    public static SingletonUsingSerialization getInstance(){
        return Singleton.instance;
    }
	
    
  
    
    //to overcome the serialization problem in singleton design pattern
    protected Object readResolve() {
    	return getInstance();
    	}

}
