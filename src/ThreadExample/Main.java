package com.ThreadExample;

public class Main {
		public static void main(String[] argd)
		{
			MultithreadDemo t1=new MultithreadDemo();
			Userthread2 t2=new Userthread2();
			t1.start();
			t2.start();
		}
}
