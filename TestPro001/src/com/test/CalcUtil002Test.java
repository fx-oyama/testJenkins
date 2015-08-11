package com.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fx.CalcUtil;

public class CalcUtil002Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test001() {
		System.out.println(">>> test002");
		int a = 1;
		int b = 2;
		int result = 3;
		int cal = 0;

		CalcUtil cv = new CalcUtil();

		cal = cv.calculateValue(a, b);

		assertEquals(result, cv.calculateValue(a, b));

	}

	@Test
	public void test002() {
		System.out.println(">>> test002");
		int a = 1;
		int b = 2;
		int result = 3;
		int cal = 0;

		CalcUtil cv = new CalcUtil();

		cal = cv.calculateValue(a, b);

		assertEquals(result, cv.calculateValue(a, b));

	}

}
