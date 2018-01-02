package com.qa.tests;

import org.testng.annotations.Test;

public class demoTest1 {
	
	@Test
	public void sum(){
		int a = 10;
		int b=20;
		System.out.println(a+b);
	}
	
	@Test
	public void sub(){
		int a = 10;
		int b=20;
		System.out.println(a-b);
	}
	
	@Test
	public void mul(){
		int a = 10;
		int b=20;
		System.out.println(a*b);
	}
	
	@Test
	public void div(){
		int a = 10;
		int b=20;
		System.out.println(b/a);
	}

}
