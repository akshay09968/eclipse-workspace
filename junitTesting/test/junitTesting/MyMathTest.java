package junitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class MyMathTest {
	MyMath mymath = new MyMath();
	
	@Before
	public void before() {
		System.out.println("Before");
	}
	
	@After
	public void after() {
		System.out.println("After");
	}
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before class");
	}
	
	@AfterClass 
	public static void afterClass() {
		System.out.println("After class");
	}
	
	@Test
	public  void sum_with3numbers() {
		//Absence of failure is success
		//check that result is 6
		System.out.println("Test 1");
		assertEquals(6,mymath.sum(new int[]{1,2,3}));
	}
	
	public  void sum_with2numbers() {
		System.out.println("Test 2");
		assertEquals(5,mymath.sum(new int[]{2,3}));
	}
}
