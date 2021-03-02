package com.singletonDesignPattern;

//6.	Cloning issue and its resolver 
// 
import java.io.Serializable;

public class ThreadSafeClone implements Cloneable, Serializable {
	private static ThreadSafeClone instance;

	private ThreadSafeClone() {
	}

	public static ThreadSafeClone getInstanceUsingDoubleLocking() {
		if (instance == null) {
			synchronized (ThreadSafeClone.class) {
				if (instance == null) {
					instance = new ThreadSafeClone();
				}
			}
		}
		return instance;
	}

	// here we basically return the same instance we initialize above so that
	// another object can not be created

	@Override
	protected Object clone() throws CloneNotSupportedException {

		return instance;
	}
}
