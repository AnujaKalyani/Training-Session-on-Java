package collectionfam.com;

import java.util.Set;
import java.util.TreeSet;

public class StoringNames {

	public static void main(String[] args) {
		Set<String>names=new TreeSet<String>();
		names.add("Vijay");
		names.add("sanjay");
		names.add("manjay");
		names.add("tajay");
		System.out.println("Sorted Names");
		for(String name:names) {
			System.out.println(name);
			
		}
	}

}
