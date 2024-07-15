package java_8_fratures.com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DemoStream_1 {

	public static void main(String[] args) {
		ArrayList<Integer> arraylist=new ArrayList<Integer>();
		arraylist.add(2);
		arraylist.add(6);
		arraylist.add(9);
		arraylist.add(10);
		arraylist.add(11);
		System.out.println("Collection element:"+arraylist);
		System.out.println("*******************************");
		
		List<Integer> evenNumber=arraylist.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println("List of even number:"+evenNumber);
		System.out.println("*******************************");
		
	}

}
