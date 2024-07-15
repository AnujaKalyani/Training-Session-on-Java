package GbCollection.com;

public class CounterTest {
	public static int count;
	public CounterTest() {
		count++;
	}

	public static void main(String[] args) {
		CounterTest obj1=new CounterTest();
		System.out.println("Number of object:"+CounterTest.count);
		CounterTest obj2=new CounterTest();
		System.out.println("Number of object:"+CounterTest.count);
		
		Runtime r=Runtime.getRuntime();
		obj1=null;
		obj2=null;
		
		r.gc();
		
	}
	protected void finalize() {
		System.out.println("Program about to terminate");
		CounterTest.count--;
		System.out.println("Number of Objects:"+CounterTest.count);
		
	}

}
