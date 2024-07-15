package sak.thread;
class MyThread4 extends Thread
{
	public void run() 
	{
		for( int i=0;i<=10;i++) {
			System.out.println(i+" "+Thread.currentThread().getName());
	}
	}
}

public class ThreadDemoUsingJoin {

	public static void main(String[] args) throws InterruptedException {
		MyThread4 th=new MyThread4();
		th.start();
		th.join();//Pause the current thread execution and give chance to anather thread & check alives of tnread
		for( int i=0;i<=10;i++) {
			System.out.println(i+" "+Thread.currentThread().getName());
	}

	}

}
