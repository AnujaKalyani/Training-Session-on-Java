package sak.thread;
class MyThread extends Thread{
	public void run() {
		System.out.println("hello");
	}
}
public class ThreadDemo {

	public static void main(String[] args) {
		
		MyThread th=new MyThread();
		th.start();
		
	}

}
