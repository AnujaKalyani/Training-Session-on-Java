package exception.com;

class MyException extends Exception{
	public MyException(String s) {
		super(s);
	}
	
}

public class ExpectionDemo {

	public static void main(String[] args) {
		try {
			throw new MyException("My Exception");
		}
		catch (MyException ex) {
			System.out.println("Exception is caught");
			System.out.println(ex.getMessage());
		}
		
	}

}
