package com.singletonDesignPattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

//7.	Using Reflection to destroy Singleton Pattern
public class JavarRefelctionDestroyTester {
	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		EagerInitialize eagerInstance1 = EagerInitialize.getEagerInstance();
		EagerInitialize eagerInstance2 = null;

		Constructor[] constructors = EagerInitialize.class.getDeclaredConstructors();
		constructors[0].setAccessible(true);

		eagerInstance2 = (EagerInitialize) constructors[0].newInstance();

		// here the hashcode will be different because of reflection we can access
		// private constructor and because of that we can create the instance thats why
		// it is breaking singleton design pattern.

		System.out.println("Hashcode of instance 1: " + eagerInstance1.hashCode());
		System.out.println("Hashcode of instance 2: " + eagerInstance2.hashCode());

	}

}
