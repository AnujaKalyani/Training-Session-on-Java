package sak.thread;
class MyThread5 extends Thread{
	public void run() {
		try {
			this.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}


	}
}

public class Thread_deadlock {

	public static void main(String[] args) {
		MyThread5 th=new MyThread5();
		th.start();
		for( int i=0;i<=10;i++) {
			System.out.println(i+" "+Thread.currentThread().getName());
	}
		
		
	}

}
//whew we are not use join method properly then deadlock situation occurs.
