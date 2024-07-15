package sak.com;
 abstract class ATM{
	 abstract void withdraw();
	 abstract void getbalance();
	 public void display() {
		 System.out.println("Display");
		 
	 }
	
}
 class AbstDemo extends ATM{
	 void withdraw() {
		 System.out.println("Withdrow");
	 }
	 void getbalance() {
		 System.out.println("Getbalance");
		 
	 }
	 
 }

public class AbstractDemo{

	public static void main(String[] args) {
		
		AbstDemo a=new AbstDemo();
		a.display();
		a.getbalance();
		a.withdraw();
	}

}
