package collectionfam.com;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Hashset {

	public static void main(String[] args) {
		//Set<Integer> set=new HashSet<>();
		//Set<Integer> set=new TreeSet<>();
		Set<Integer> set=new LinkedHashSet<>();
		for(int i=30;i>0;i--) {
			set.add(i);
		}
		for(int i:set) {
			System.out.println(i);
		}

	}

}
