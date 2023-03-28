package Learning.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.testng.annotations.Test;

public class ArrayListExample {

	@Test
	public void arrayListExample() {
		ArrayList bikes = new ArrayList();

		bikes.add("TVS");
		bikes.add("TVS");
		bikes.add("KTM");
		bikes.add("KTM");
		bikes.add("BMW");
		bikes.add("BMW");

		System.out.println(bikes);
		Iterator it = bikes.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	@Test
	public void hashsetlearn() {
		Set bikes = new HashSet();

		bikes.add("TVS");
		bikes.add("TVS");
		bikes.add("KTM");
		bikes.add("KTM");
		bikes.add("BMW");
		bikes.add("BMW");

		System.out.println(bikes);
		Iterator it = bikes.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
