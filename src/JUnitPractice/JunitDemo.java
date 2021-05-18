package com.JUnitPractice;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class JunitDemo {
	@Test
	public void testsetup()
	{
		String str="Welcome in Junit setup";
		assertEquals("Welcome in Junit setup",str);
	}
}
