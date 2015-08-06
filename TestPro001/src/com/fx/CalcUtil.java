package com.fx;

public class CalcUtil {

	public CalcUtil() {
	}

	// 計算
	public int CalculateValue(final int a, final int b) {
		return a + b;
	}

	// FindBugsエラー
	public void checkStr() {
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
