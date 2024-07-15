package collectionfam.com;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemoFive {

	public static void main(String[] args) {
		LinkedList<String> countries=new LinkedList<String>();
		countries.add("India");
		countries.add("USA");
		countries.add("Poland");
		countries.add("Egypt");
		countries.add("Thailand");
		countries.add("Rasia");
		//ListInterfaceDemo demo=new ListInterfaceDemo();
		//demo.printList(countries);
		//System.out.println(countries);
		IteratorDemoFive id=new IteratorDemoFive();
		id.printList(countries);
		
	}
	void printList(List<String> list) {
		/*for(String elements:list) {
			System.out.println("Element:"+elements);
		}*/
	Iterator<String> iterator=list.iterator();
	while(iterator.hasNext()) {
		System.out.println("Element:"+iterator.next());
	}
	
	/*ListIterator<String> iterator=list.listIterator();
	while(iterator.hasNext()) {
		System.out.println("Element:"+iterator.next());
	}*/
	
	
	}

}
