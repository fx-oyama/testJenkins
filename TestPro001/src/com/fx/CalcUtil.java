/**
 * apapa.
 */
package com.fx;

/**
 * Calcutil.
 * @author fxY6641
 *
 */
public class CalcUtil {
	/**
	 * com.
	 */
	public CalcUtil() {
	}

	/**
	 * 計算.
	 * @param a aaaa
	 * @param b fvvv
	 * @return ssss
	 */
	public final int calculateValue(final int a, final int b) {
		return a + b;
	}

	/**
	 * FindBugsエラー.
	 */
	public final void checkStr() {
		String aStr = "abc";
		String bStr = "efg";
		String cStr = "";

		if (aStr == bStr) {
			cStr = "ok";
		}

		while (true) {
			System.out.println(">>>>" + cStr);
			if (cStr == "1") {
				break;
			}
		}

		System.out.println(">>>>" + cStr);
	}

}
