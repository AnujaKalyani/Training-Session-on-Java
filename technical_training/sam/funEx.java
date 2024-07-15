package sam.com;

public class funEx {

	public static void main(String[] args) {
		add();
funEx obj1=new funEx();
obj1.sub();
int res=obj1.div();
System.out.println("Division:"+ res);
	}
	public  static void add() {
		int a=1;
		int b=2;
		int total=a+b;
		System.out.println("Addition:"+total);
	}
	public void sub() {
		int a=1;
		int b=2;
		int total=a-b;
		System.out.println("Substraction:"+total);
	}
	public int div() {
		
		int a=1;
		int b=2;
		int total=a/b;
		return total;
		
	}
	

}
