package sak.com;


class A{
	void m1() {
		System.out.println("in method m1 of A");
	}
	
}
public class sperclassref  extends A{
	int m1(int a) {
		a=100;
		return a;
	}
	

	public static void main(String[] args) {
		
		sperclassref x=new sperclassref();
		//x=new A2();
		//z=new A1();
		x.m1();
		

	}

}
