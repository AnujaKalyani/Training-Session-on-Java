package sak.com;

	class Base{
		public int a,b;
		void getData(int x,int y)
		{
		a=x;
		b=y;
		}	
		void disp() {
			System.out.println("Base class:"+ a +" " + b);
		}
		}
	 class Der extends Base{
		public int a,b;
		void assigndata(int x,int y)
		{
		a=x;
		b=y;
		}	
		void disp() {
			super.disp();
			System.out.println("Derived class:"+a+" "+b);
			int total=super.a+super.b +a+b;
			System.out.println("Total:"+total);
		}
		
	}
	public class Superex {
		

		public static void main(String[] args) {
			Der d=new Der();
			d.getData(4,5);
			d.assigndata(10, 20);
			d.disp();
			

		}

}
