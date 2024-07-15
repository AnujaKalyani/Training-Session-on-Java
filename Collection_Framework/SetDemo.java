package collectionfam.com;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set<String> set=new HashSet<String>();
		set.add("Sam");
		set.add("sak");
		set.add("savani");
		set.add("viju");
		set.add("chand");
		System.out.println(set);
		
		 for(String name:set) {
			 System.out.println(name);
		 }
System.out.println(set.contains("Sam"));
	}

}
