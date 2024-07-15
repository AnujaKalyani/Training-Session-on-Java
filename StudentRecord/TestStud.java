package stud.com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class TestStud {

	public static void main(String[] args) {
		/*Student st=new Student(1,"Sakshi","Ugare");
		String s=st.toString();
		System.out.println(s);*/
		
		Map<Integer,Student> studentMap=new HashMap<Integer,Student>();
		studentMap.put(1,new Student(1,"Sakshi","Ugare"));
		studentMap.put(2,new Student(2,"Madhuri","Patil"));
		studentMap.put(3,new Student(3,"Sakshi","Kadam"));
		studentMap.put(4,new Student(4,"Sakshi","Lohar"));
		studentMap.put(5,new Student(5,"Sanika","Faske"));
		studentMap.put(6,new Student(6,"Srushti","Kambale"));
		
		Iterator<Entry<Integer,Student>>entry=studentMap.entrySet().iterator();
		while(entry.hasNext()) {
			Entry<Integer,Student> temp=entry.next();
			System.out.println("Key "+temp.getKey()+" value "+temp.getValue());
		}
		
		
		

	}

}
