package Learning.java;

public class StaticLearning {

	/*
	 * keyword efficient memory management 
	 * 1, variable > ( class variables) 
	 * 2, methods > ( belongs to the class ) and you can access the method with class name wo creating object 
	 * 3. Block 
	 * 4. Nested Class
	 * 
	 * Static methods: Belong to class and not to objects Method involation can be
	 * done without creating the object
	 */

	// ModifyStrings
	String empName;
	String address;
	private static String company = "TCS";

	public static void modifyString(String companyChange) {
		company = companyChange;
	}

	public StaticLearning(String empName, String address) {

		this.empName = empName;
		this.address = address;
	}

	public void displayDetails() {

		System.out.println(empName);
		System.out.println(address);
		System.out.println(company);
	}

	/*
	 * String empName ; String address; String company;
	 * 
	 * public StaticLearning() { } public StaticLearning( String empName , String
	 * address , String company ) {
	 * 
	 * this.empName = empName; this.address =address; this.company = company; }
	 * public void displayDetails() {
	 * 
	 * System.out.println(empName); System.out.println(address);
	 * System.out.println(company); } }
	 */

	// Static add method
	/*
	 * String empName ; String address; public static String company = "TCS";
	 * 
	 * public StaticLearning() { } public StaticLearning( String empName , String
	 * address ) {
	 * 
	 * this.empName = empName; this.address =address; } public void displayDetails()
	 * {
	 * 
	 * System.out.println(empName); System.out.println(address);
	 * System.out.println(company); } }
	 */
}