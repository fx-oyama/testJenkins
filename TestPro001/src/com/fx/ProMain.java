package com.fx;

public class ProMain {

	public static void main(String[] args) {

		test001();

	}

	private static void test001() {
		CalcUtil ut = new CalcUtil();
		int val = 0;

		val = ut.CalculateValue(1, 2);

		System.out.println("val = " + val);

	}

}
