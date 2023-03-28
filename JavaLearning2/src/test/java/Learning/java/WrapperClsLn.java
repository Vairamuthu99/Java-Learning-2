package Learning.java;

import org.testng.annotations.Test;

public class WrapperClsLn {
			
		/*
		 * byte
		 * int
		 * short long
		 * double 
		 * char
		 *
		 * Wrapper Class 
		 * int  > Integer
		 * char > Character
		 * boolean > Boolean
		 */

		@Test
		public void wrapper() {

			int a = 10; // its a premative data type
			Integer b = 5; // its a class
			Character ch = 'V'; // its a object
			Boolean ab = true;
			boolean ba = false;

			System.out.println(a);
			System.out.println(b);
			System.out.println(ab);
			System.out.println(ba);
		}
	}
