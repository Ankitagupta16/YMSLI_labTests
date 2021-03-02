package com.singletonDesignPattern;

//6.	Cloning issue and its resolver 
// 
import java.io.Serializable;

public class ThreadSafeCloneIssue implements Cloneable, Serializable {
	private static ThreadSafeCloneIssue instance;

	private ThreadSafeCloneIssue() {
	}

	public static ThreadSafeCloneIssue getInstanceUsingDoubleLocking() {
		if (instance == null) {
			synchronized (ThreadSafeCloneIssue.class) {
				if (instance == null) {
					instance = new ThreadSafeCloneIssue();
				}
			}
		}
		return instance;
	}

	// here we basically return the same instance we initialize above so that
	// another object can not be created

	@Override
	protected Object clone() throws CloneNotSupportedException {

		return super.clone();
	}
}
