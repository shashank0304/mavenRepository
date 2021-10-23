package com.ssangu.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ssangu.JavaHelloWorld;

public class JavaHelloWorld1Test {
	
	@Test
	public void testHelloWorld() {
			
		JavaHelloWorld javaHelloWorld = new JavaHelloWorld();
		
		assertEquals("Java HelloWorld", javaHelloWorld.getHello());
		System.out.println("Junit 4");
	}
}
