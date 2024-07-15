package collectionfam.com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer, String> student=new HashMap<>();
		student.put(3, "sakshi");
		student.put(2, "tanvi");
		student.put(1, "mansi");
		
		/*for(Map.Entry<Integer, String> entry:student.entrySet()) {
			System.out.println("key "+entry.getKey()+" Value "+entry.getValue());*/
		
		/*for(Integer key:student.keySet()) {
			System.out.println("Key "+key+" value "+student.get(key));
		}*/
		
		Iterator<Entry<Integer,String>> entry1=student.entrySet().iterator();
		while(entry1.hasNext()) {
			Entry<Integer,String>temp=entry1.next();
			System.out.println("key "+temp.getKey()+" Value "+temp.getValue());
		}
			
		}
		
		
		
	}

//}
