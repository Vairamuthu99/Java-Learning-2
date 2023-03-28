package Learning.java;

import org.testng.annotations.Test;

public class ExceptionTypes1Ln {

	@Test
	public void arithmeticExceptionlearning() {
		System.out.println("Hello World");
		int a, b;
		a = 10;
		b = 5;

		int c = b / a;
	}

	@Test
	public void nullPointerExceptionlearning() {
		System.out.println("Hello World");
		int a, b;
		String name = null;
		a = name.length();
	}

	@Test
	public void numberFormatExceptionlearning() {
		System.out.println("Hello World");
		String name = "abc";
		int a = Integer.parseInt(name);
	}

	@Test
	public void arrayIndexoutOfBoundExceptionlearning() {
		System.out.println("Hello World");
		int[] a = new int[100];
		int lastValue = a[100];
	}
}
