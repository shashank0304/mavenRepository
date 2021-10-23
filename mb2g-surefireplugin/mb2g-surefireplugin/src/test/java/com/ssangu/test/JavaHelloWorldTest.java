package com.ssangu.test;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.ssangu.JavaHelloWorld;

public class JavaHelloWorldTest {
	
	@Test
	public void testGetHello() {
		
		JavaHelloWorld javaHelloWorld = new JavaHelloWorld();
		//assert("Java HelloWorld".equals(javaHelloWorld.getHello()));
		
		assertEquals("Java HelloWorld", javaHelloWorld.getHello());
		System.out.println("Junit 5");
	}
}
