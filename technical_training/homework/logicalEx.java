package homework.com;
import java.util.*;
public class logicalEx {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of x either true or false:");
		boolean x=sc.nextBoolean();
		System.out.println("Enter value of y either true or false:");
		boolean y=sc.nextBoolean();
		System.out.println("x&&y="+(x&&y));
		System.out.println("x||y="+(x||y));
		System.out.println("!x&&y="+ !(x&&y));
	}

}
