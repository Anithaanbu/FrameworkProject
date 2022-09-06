package org.testng;

import org.testng.annotations.Test;

public class Parallel {
	@Test
	public void tc3() {
		System.out.println("Test 3:"+Thread.currentThread().getId());
		System.out.println("Test 3");
	}
	@Test
	public void tc2() {
		System.out.println("Test 2:"+Thread.currentThread().getId());
		System.out.println("Test 2");
	}
	@Test
	public void t1() {
		System.out.println("Test 1:"+Thread.currentThread().getId());
		System.out.println("Test 1");
	}
	

}
