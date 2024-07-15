package emp.com;

public class EmpManage {

	public static void main(String[] args) {
		//System.out.println("hello");
		Developer d=new Developer("Sakshi", 101, 56000,"java");
		d.displayDetails();
		
		Manager m=new Manager("Joy", 100,8000000,"Development");
		m.displayDetails();

	}

}
