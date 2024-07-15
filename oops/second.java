package sak.com;

public class second extends first{
	int c;
	second(int m,int n,int o){
		super(m,n);
		c=o;
	}
	void display() {
		super.display();
		
		System.out.println("c:"+c);
	}

}
