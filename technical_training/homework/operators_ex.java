package homework.com;

import java.util.Scanner;

public class operators_ex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a:");
		int a=sc.nextInt();
		System.out.println("Enter value of b:");
		int b=sc.nextInt();
		System.out.println("------------Arithmatic Operatorations-----------");
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(a/b));
		System.out.println("a%b="+(a%b));
		System.out.println("-----------Unary Operatorations------------");
		System.out.println("a++ ="+(++a));
		System.out.println("b-- ="+(--b));
		System.out.println("++a ="+(a++));
		System.out.println("--b ="+(b--));
		System.out.println("-----------Relational operations------------");
		System.out.println("a==b="+(a==b));
		System.out.println("a!=b="+(a!=b));
		System.out.println("a>b="+(a>b));
		System.out.println("a<b="+(a<b));
		System.out.println("a>= ="+(b>=a));
		System.out.println("a<= ="+(b<=a));
		System.out.println("----------Logical operayions-------------");
		System.out.println("Enter value of x either true or false:");
		boolean x=sc.nextBoolean();
		System.out.println("Enter value of y either true or false:");
		boolean y=sc.nextBoolean();
		System.out.println("x&&y="+(x&&y));
		System.out.println("x||y="+(x||y));
		System.out.println("!x&&y="+ !(x&&y));
		
	}

}
