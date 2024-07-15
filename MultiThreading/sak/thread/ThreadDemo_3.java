package sak.thread;
class MyThread1 extends Thread{
	public void run() {
		for( int i=0;i<=10;i++) {
			System.out.println(i);
		}
		
	}
}


public class ThreadDemo_3 {

	public static void main(String[] args) {
		MyThread1 th=new MyThread1();
		MyThread1 th2=new MyThread1();
		
		th.start();
		th2.start();

	}

}
