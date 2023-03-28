package Learning.java;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import org.testng.annotations.Test;

public class MapLnTest {

	@Test
	public void hashMapLearning() {

		Map<Integer, String> ep = new HashMap<Integer, String>();

		ep.put(001, "Kamal");
		ep.put(002, "Muthu");
		ep.put(003, "Santhosh");
		ep.put(004, "Vairam");
		ep.put(000, null);

		System.out.println(ep);

		for (Map.Entry<Integer, String> Employee : ep.entrySet()) {
			System.out.println("Key : " + Employee.getKey());
			System.out.println("Value : " + Employee.getValue());
		}
	}

	@Test
	public void LinkedHashMapLearning() {

		Map<Integer, String> ep = new LinkedHashMap<Integer, String>();

		ep.put(001, "Kamal");
		ep.put(002, "Muthu");
		ep.put(003, "Santhosh");
		ep.put(004, "Vairam");
		ep.put(000, null);

		System.out.println(ep);
	}

	@Test
	public void TreeMapLearning() {

		Map<Integer, String> ep = new TreeMap<Integer, String>();

		ep.put(001, "Kamal");
		ep.put(002, "Muthu");
		ep.put(003, "Santhosh");
		ep.put(004, "Vairam");
		ep.put(000, null);

		System.out.println(ep);
	}
}
