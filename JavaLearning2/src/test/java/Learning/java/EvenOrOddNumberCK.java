package Learning.java;

import java.util.Scanner;
import org.testng.annotations.Test;

public class EvenOrOddNumberCK {

	@Test
	public void evenoddcheck() {
		int n = 5;

		if (n % 2 == 0) {
			System.out.println("Even number");
		} else {
			System.out.println("Odd number");
		}
	}

	/*To Get input from the user at run time  
	 * Scanner > Class
	 */

	@Test
	public void evenOddCheck() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter X value : ");

		int n = sc.nextInt();

		System.out.println("The x value is " + n);

		if (n % 2 == 0) {
			System.out.println("Even Integer");
		} else {
			System.out.println("Odd Integer");
		}
	}

	@Test

	public void StringMainip() {

		Scanner van = new Scanner(System.in);

		System.out.println("Secret Agent : ");
		Object name = van.nextLine();
		System.out.println("The name is :" + name);
	}
}
