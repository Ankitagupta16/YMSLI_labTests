package com.singletonDesignPattern;


//2. Static block initialization
public class StaticBlock {
	private static StaticBlock staticInstance;

	private StaticBlock() {
	}

	// static block initialization
	static {

		try {
			staticInstance = new StaticBlock();
		} catch (Exception e) {
			throw new RuntimeException("There might be some Exception occured in creating singleton instance");
		}
	}

	public static StaticBlock getStaticInstance() {
		return staticInstance;
	}

}
