package exception.com;
import java.util.*;

public class TestClass {

	public static void main(String[] args) throws ArithmeticException {
		//try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter value of a:");
			int a=sc.nextInt();
			System.out.println("Enter value of b:");
			int b=sc.nextInt();
			int c=a/b;
			System.out.println("Division:"+c);
			
		//}
		/*catch(Exception e) {
			e.printStackTrace();
			//System.out.println(e.getMessage());
			
			//System.out.println("Cant divide by zero..........");
		}*/
		System.out.println("Hello.....");
		
		

	}

}
