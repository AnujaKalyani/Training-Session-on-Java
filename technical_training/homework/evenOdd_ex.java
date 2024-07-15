package homework.com;
import java.util.Scanner;
public class evenOdd_ex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int i_val=sc.nextInt();
		if(i_val%2==0)
		{
		System.out.println("Number is Even");
		}
		else {
			System.out.println("The number is Odd number");
		}

	}

}
