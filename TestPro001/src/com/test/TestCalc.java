package com.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fx.CalcUtil;

public class TestCalc {

	static {
		System.out.println("static init call");
	}

	{
		System.out.println("instance init call");
	}

	public TestCalc() {
		System.out.println("constractor call");
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize call");
		try {
			super.finalize();
		} catch (Exception e) {
		}
	};

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println(">>> @BeforeClass");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println(">>> @AfterClass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println(">>> @Before");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println(">>> @After");
	}

	@Test
	public void test001() {
		System.out.println(">>> test");
		int a = 1;
		int b = 2;
		int result = 3;
		int cal = 0;

		CalcUtil cv = new CalcUtil();

		cal = cv.CalculateValue(a, b);

		assertEquals(result, cv.CalculateValue(a, b));

	}

	@Test
	public void test002() {
		System.out.println(">>> test");
		int a = 2;
		int b = 4;
		int result = 5;
		int cal = 0;

		CalcUtil cv = new CalcUtil();

		cal = cv.CalculateValue(a, b);

		assertEquals(result, cv.CalculateValue(a, b));

	}

	@Test
	public void test003() {
		System.out.println(">>> test");
		int a = 1;
		int b = 4;
		int result = 5;
		int cal = 0;

		CalcUtil cv = new CalcUtil();

		cal = cv.CalculateValue(a, b);

		assertEquals(result, cv.CalculateValue(a, b));

	}

}
