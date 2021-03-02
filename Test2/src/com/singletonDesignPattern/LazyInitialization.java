package com.singletonDesignPattern;
//3. Lazy Initialization

public class LazyInitialization {
	
private static LazyInitialization lazyInstance;
    
    private LazyInitialization(){}
    
    //Lazy Initialization of the instance
    public static LazyInitialization getLazyInstance(){
        if(lazyInstance == null){
        	lazyInstance = new LazyInitialization();
        }
        return lazyInstance;
    }
	
	

}
