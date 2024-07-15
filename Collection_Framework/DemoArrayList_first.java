package collectionfam.com;

import java.util.ArrayList;
import java.util.List;

public class DemoArrayList_first {

	public static void main(String[] args) {
		List<Integer> ls=new ArrayList();
		ls.add(1);
		ls.add(2);
		ls.add(3);
		ls.add(4);
		
		System.out.println(ls);
		
		ls.add(5);
		System.out.println(ls);
		
		List <Integer> newList=new ArrayList();
		newList.add(10);
		newList.add(11);
		newList.add(12);
		ls.addAll(newList);
		System.out.println(ls);
		System.out.println(ls.get(5));
		ls.remove(7);
		System.out.println(ls);
		
		
	}

}
