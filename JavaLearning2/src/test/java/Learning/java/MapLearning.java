package Learning.java;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import org.testng.annotations.Test;

public class MapLearning {

	/*
	 * Map > Interface available in the package java.util Map interface is not under Collections 
	 * Map contains ( Key , Pair) 
	 * city Zip code zipcode is key y\and city is the value 
	 * HashMap , Tree Map , LinkedHashMap 
	 * Syntax is ;
	 * Map<Integer,String> citymapping = new HashMap<Integer,String>
	 */

	@Test
	public void hashMapLearning() {

		// Creation
		Map<Integer, String> cm = new HashMap<Integer, String>();
		// Storing Data

		cm.put(076, "Tenkasi");
		cm.put(072, "Nellai");
		cm.put(010, "Chennai");
		cm.put(076, "Thenkasi");
		cm.put(001, null);

		System.out.println(cm);
		// System.out.println(cm.get(076)); //To get specific data
		// System.out.println(cm.containsValue("Chennai")); //To view True or False
		// Value
		// System.out.println(cm.containsKey(999)); //To view True or False Key

		for (Map.Entry<Integer, String> citymaping : cm.entrySet()) {
			System.out.println("Key : " + citymaping.getKey());
			System.out.println("Value : " + citymaping.getValue());
		}
	}

	@Test

	public void LinkedHashMapLearning() {

		Map<Integer, String> cm = new LinkedHashMap<Integer, String>();

		cm.put(076, "Tenkasi");
		cm.put(072, "Nellai");
		cm.put(010, "Chennai");
		cm.put(076, "Thenkasi");
		cm.put(001, null);

		System.out.println(cm);
	}

	@Test
	public void TreeMapLearning() {

		Map<Integer, String> cm = new TreeMap<Integer, String>();

		cm.put(076, "Tenkasi");
		cm.put(072, "Nellai");
		cm.put(010, "Chennai");
		cm.put(076, "Thenkasi");
		cm.put(001, null);

		System.out.println(cm);
	}
	/*
	 * HashMap op:It will be arrange in random order 
	 * LinkedMap op:It will be arrange in our listed wise TreeMap op:It will be arrange in small to big order
	 */
}
