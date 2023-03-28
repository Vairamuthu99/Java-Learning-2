package Learning.java;

import org.testng.annotations.Test;

public class ExceptionLearning {
		
		/*
		 * An exception is an event that disrupts the normal flow of the program. 
		 * To handle the exception we have the Exception Handling in Java. 
		 * Whenever JVM encounters an exception in run time it throws an exception object. 
		 * We will be catching the exceptional object and we will handle it
		 * 
		 * Two type of Exception: 
		 * CompileTime Exceptions = Checked Exception 
		 * RunTime Exception = Unchecked Exceptions
		 * 
		 * Keywords: 
		 * Try block: The code which is supposed to throw an exception is written inside this try block 
		 * Catch block : Is used to catch the exception object. 
		 * Finally : This block will execute the important code which would run for sure this is optional block 
		 * One try block at least should have one catch
		 * One try block can have multiple catch block 
		 * A try block should be immediately followed up by the catch block. 
		 * You can have multiple try blocks and catch blocks 
		 *
		 * Throw : It is used to throws an exception 
		 * Throws : It is to declare an exception
		 * 
		 * Examples: 
		 * Arithmetic Exception 
		 * Null pointer Exception 
		 * File not found Exception 
		 * Number Format Exception 
		 * Array Index out of Bound Exception etc
		 */

		@Test
		public void arithmeticExceptionlearning() {
			System.out.println("Hello World");
			int a, b;
			a = 10;
			b = 5;

			if (2 / a == 0) {
				System.out.println("a is divisible by 2");
			} else {
				System.out.println("a is not divisible by 2");
			}
			if (a > b) {
				System.out.println("The value  is greater");
			} else {
				System.out.println("The value is smaller");
			}
		}
	}
/*	@Test
	public void arithemeticException() {
	
		System.out.println("Hello World");
		    int a, b ;
	            a = 0;
	            b = 2;
	       	int c =b/a;
    }

	@Test
	public void nullpointer() {
		System.out.println("Hello World");
	        int a,b ;
	        String name = null;
	        a =  name.length();
         }
	@Test
	public void numberformatexception() {
		System.out.println("Hello World");
	        int[] a = new int[100];
	        int lastvalue = a[100];
	        }
	}
*/
