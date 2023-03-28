package Learning.java;

public class StaticLnMain {

	/*
	 * public static void main(String[] args) {
	 * 
	 * StaticLearning Vairam = new StaticLearning("Vairam","Kadayanallur","TCS");
	 * StaticLearning Muthu = new StaticLearning("Muthu","Chennai","TCS");
	 * Vairam.displayDetails(); Muthu.displayDetails(); } }
	 */

	/*
	 * //Static add method
	 * 
	 * public static void main(String[] args) {
	 * 
	 * StaticLearning.company="Google";
	 * 
	 * StaticLearning Vairam = new StaticLearning("Vairam","Kadayanallur");
	 * StaticLearning Muthu = new StaticLearning("Muthu","Chennai");
	 * Vairam.displayDetails(); Muthu.displayDetails();
	 * 
	 * } }
	 */

	public static void main(String[] args) {

		StaticLearning.modifyString("META");

		StaticLearning Vairam = new StaticLearning("Vairam", "Kadayanallur");
		StaticLearning Muthu = new StaticLearning("Muthu", "Chennai");
		Vairam.displayDetails();
		Muthu.displayDetails();
	}
}