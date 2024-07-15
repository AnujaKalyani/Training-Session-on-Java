package sam.com;

import java.util.Scanner;

public class StatementTest {

	public static void main(String[] args) {
		String res;
		do {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the quantity:");
		int quantity=sc.nextInt();
		System.out.println("Enter the price:");
		double price=sc.nextDouble();
		double total=quantity*price;
		System.out.println("Total is"+total);
		System.out.println("-----------------------");
		System.out.println("do yo want to perform agnain (y/n):");
		res=sc.next();
		
		}
		while(res.equals("y"));
	}
		


}
