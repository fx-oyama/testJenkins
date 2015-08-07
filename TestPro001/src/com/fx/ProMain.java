package com.fx;

/**
 * @author fxY6641
 *
 */
public final class ProMain {

	/**
	 * const.
	 */
	private ProMain() {
	}

	/**
	 * main.
	 * @param args aaa.
	 */
	public static void main(final String[] args) {

		test001();

	}

	/**
	 * test.
	 */
	private static void test001() {
		CalcUtil ut = new CalcUtil();
		int val = 0;

		val = ut.calculateValue(1, 2);

		System.out.println("val = " + val);

	}

}
