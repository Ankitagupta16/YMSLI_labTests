package com.singletonDesignPattern;

public class EagerInitialize {

	// 1. Eager initialization

	// Instance of Singleton Class is created at the time of class loading(thats why
	// its called eager)
	// problem with that is that we get the object irrespective of we want it or not

	private static final EagerInitialize eagerInstance = new EagerInitialize();

	// we define private constructor to avoid client side applications to use
	// constructor for creating objects

	private EagerInitialize() {

	}

	public static EagerInitialize getEagerInstance() {
		return eagerInstance;
	}

}
