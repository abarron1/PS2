package base;

public class MyInteger {
	private int iValue;
	private int MyInteger;

	public MyInteger(int iValue) {
		this.MyInteger = iValue;
	}

	public int getiValue() {
		return iValue;
	}

	public static boolean isEven(int iValue) {
		if (iValue % 2 == 0)
			return true;
		else
			return false;
	}

	public static boolean isOdd(int iValue) {
		if (iValue % 2 <= 0)
			return true;
		else
			return false;
	}

	public static boolean isPrime(int iValue) {
		for (int count = 2; count < iValue; count++) {
			if (iValue % count == 0)
				return false;
		}
		return true;
	}

	// creating two methods using the same name wont work so you should just use
	// a simple if statement
	public boolean equals(int x) {
		if (x == MyInteger)
			return true;
		else
			return false;
	}

}
