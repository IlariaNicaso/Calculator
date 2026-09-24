package se.unibg.it.calculator;

public class Calculator {
	public static int Somma(int a, int b) {
		return (a + b);
	}

	public static int div(int a, int b) throws ArithmeticException {
		if (b != 0)
			return a / b;
		else
			return 0;
	}
}
	
	public static int prod(int a, int b) {
		return a*b;
	}

	public static int Differenza(int a, int b) {
		return (a-b);
	}
}
