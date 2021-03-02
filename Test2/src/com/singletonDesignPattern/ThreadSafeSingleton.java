package com.singletonDesignPattern;

//4.	Thread Safe Singleton. 



public class ThreadSafeSingleton {

	private static ThreadSafeSingleton instance;

	private ThreadSafeSingleton() {
	}

	// this produces the one same object everytime because one thread can acquire
	// one's problem with that is it is costly because we put synchronized on method
	// solution of above is double checked locking phase
	public static synchronized ThreadSafeSingleton getInstance() {
		if (instance == null) {
			instance = new ThreadSafeSingleton();
		}
		return instance;
	}

//double checked locking phase

	public static ThreadSafeSingleton getInstanceUsingDoubleLocking() {
		if (instance == null) {
			synchronized (ThreadSafeSingleton.class) {
				if (instance == null) {
					instance = new ThreadSafeSingleton();
				}
			}
		}
		return instance;
	}

}