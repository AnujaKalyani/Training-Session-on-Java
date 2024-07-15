package sam.com;
import java.util.*;

public class user_input_ex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your age:");
		int age=sc.nextInt();
		if(age>=18) {
			System.out.println("Eligible for voting");
			
		}
		else {
			System.out.println(" Not Eligible for voting");
		}
		
		
		

	}

}
