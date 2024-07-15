package exception.com;

public class ThrowEx {

	public static void main(String[] args) {
		int i=10,j=0,k=0;
		try {
			k=i/j;
			if (k>100) {
				throw new ArithmeticException();
			}
			System.out.println(k);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		//catch (ArithmeticException e) {
			//e.printStackTrace();
		//}
		finally {
			System.out.println("Helloo.......");

		}
		
	}

}
