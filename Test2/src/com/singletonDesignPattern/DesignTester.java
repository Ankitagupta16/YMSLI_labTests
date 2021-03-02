package com.singletonDesignPattern;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DesignTester {
	public static void main(String[] args) throws FileNotFoundException, IOException, IllegalAccessException,
			InstantiationException, ClassNotFoundException {

		// issue in serializable comes when we deserialize the object new object create
		// at other end to resolve that issue we use readResolve method
		SingletonUsingSerialization instance1 = SingletonUsingSerialization.getInstance();
		SingletonUsingSerializationIssue instance = SingletonUsingSerializationIssue.getInstance();

		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(new File("singletondemo.ser")));
		ObjectOutputStream out1 = new ObjectOutputStream(new FileOutputStream(new File("test.ser")));

		out.writeObject(instance1);
		out1.writeObject(instance);

		out.close();
		out1.close();

		ObjectInputStream in = new ObjectInputStream(new FileInputStream(new File("singletondemo.ser")));
		ObjectInputStream in1 = new ObjectInputStream(new FileInputStream(new File("test.ser")));

		SingletonUsingSerialization instance2 = (SingletonUsingSerialization) in.readObject();
		SingletonUsingSerializationIssue instance3 = (SingletonUsingSerializationIssue) in1.readObject();
		in.close();
		in1.close();
		System.out.println("------Serialisation issue ------");
		System.out.println("HashCode of instance 1 after serialisation with issue =" + instance.hashCode());
		System.out.println("HashCode of instance 2 after deserialisation with issue=" + instance3.hashCode());

		System.out.println("------Serialisation issueresolver ------");
		System.out.println("HashCode of instance 1 after serialisation=" + instance1.hashCode());
		System.out.println("HashCode of instance 2 after deserialisation=" + instance2.hashCode());

		// with clonning if we use super.clone then we get another copy that will
		// destroy the patter thats why we return the same object
		System.out.println("------clonning issue ------");

		ThreadSafeCloneIssue object1 = ThreadSafeCloneIssue.getInstanceUsingDoubleLocking();
		System.out.println("Before clonning object is: " + object1);
		ThreadSafeCloneIssue object2;
		try {
			object2 = (ThreadSafeCloneIssue) object1.clone();
			System.out.println("After clonning object is: " + object2);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("------clonning issue resolve ------");

		ThreadSafeClone object = ThreadSafeClone.getInstanceUsingDoubleLocking();
		System.out.println("Before clonning object is: " + object);
		ThreadSafeClone cloneobject;
		try {
			cloneobject = (ThreadSafeClone) object.clone();
			System.out.println("After clonning object is: " + cloneobject);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		EnumSingleton enumInstance1 = EnumSingleton.INSTANCE;
		EnumSingleton enumInstance2 = EnumSingleton.INSTANCE;

		// here the hashcode will be same

		System.out.println("----enum singleton--------");
		System.out.println("Enum instance 1 " + enumInstance1.hashCode());
		System.out.println("Enum instance 2 " + enumInstance2.hashCode());

		System.out.println("----eager instance--------");
		EagerInitialize eagerInstance = EagerInitialize.getEagerInstance();
		EagerInitialize eagerInstance1 = EagerInitialize.getEagerInstance();
		System.out.println("Eager instance 1 " + eagerInstance.hashCode());
		System.out.println("Eager instance 2 " + eagerInstance1.hashCode());

		System.out.println("----Lazy instance--------");
		LazyInitialization lazyInstance = LazyInitialization.getLazyInstance();
		LazyInitialization lazyInstance1 = LazyInitialization.getLazyInstance();
		System.out.println("Lazy instance 1 " + lazyInstance.hashCode());
		System.out.println("Lazy instance 2 " + lazyInstance1.hashCode());

		System.out.println("----Static--------");
		StaticBlock staticInstance = StaticBlock.getStaticInstance();
		StaticBlock staticInstance1 = StaticBlock.getStaticInstance();
		System.out.println("static instance 1 " + staticInstance.hashCode());
		System.out.println("static instance 2 " + staticInstance1.hashCode());

		System.out.println("----Thread Safe Singleton--------");
		ThreadSafeSingleton threadInstance = ThreadSafeSingleton.getInstanceUsingDoubleLocking();
		ThreadSafeSingleton threadInstance1 = ThreadSafeSingleton.getInstanceUsingDoubleLocking();
		System.out.println(" instance 1 " + threadInstance.hashCode());
		System.out.println(" instance 2 " + threadInstance1.hashCode());

	}

}
