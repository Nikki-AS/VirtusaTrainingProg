package com.ThreadExample;

public class RunnableMain {
	public static void main(String[] args)
	{
		RunnableDemo r=new RunnableDemo();
		Thread t=new Thread(r);
		t.start();
	}
}
