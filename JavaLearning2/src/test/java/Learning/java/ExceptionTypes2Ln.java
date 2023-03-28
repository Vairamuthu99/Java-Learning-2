package Learning.java;

import org.testng.annotations.Test;

public class ExceptionTypes2Ln {
	
	@Test
	public void finallyblocklearning() {

		/*
		 * Finally is a block which can be optional and it is used to run important code
		 * Opening a file > Close the file DB Connection open > CLosing u can write in
		 * finally block
		 */
		try {
			System.out.println(3 / 0);
		} catch (NullPointerException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Hello Blocked");
		}
	}
	    /*
	     * Thow and throws :
	     * Throw ;
	     * throw an exception explicitly u will use throw
	     * Throws :
	     * Declare an exception use throws
	     *final finally and finalize
	     * Finally :
	     * It is ablock 
	     * Use to place some important code
	     * Final :
	     * This a keyword 
	     * class methods and variable 
	     * class > final class . then this class cannot be inherited 
	     * method > final method1(){} > this cannot be overridden
	     * Variable > final int pi =3.14; constant , the value cannot be changed 
	     * finalize :
	     * This is a method in object class 
	     * This is used to clean up the garage collection 
	     */

		@Test
		public void throwLearning() {
			throw new ArithmeticException("thro example");
		}

		@Test
		public void throwsLearning() throws ArithmeticException {
			throw new ArithmeticException("thro example");
		}

		public void nestedtryBlocks() {
			try {
				int a = 0 / 34;
				try {
					String a3 = null;
					a3.length();
				} catch (Exception e) {
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
