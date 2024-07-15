package sak.thread;

import java.util.Iterator;

class MyThread3 extends Thread{
	public void run() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		for( int i=0;i<=10;i++) {
			System.out.println(i+" "+name);
			try {
				Thread.sleep(1000);//it can throws interrupted exception so we need to write try catch 
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}

public class ThreadDemoUsingSleep {

	public static void main(String[] args) {
		MyThread3 th=new MyThread3();
		th.start();
		
		Thread t=Thread.currentThread();
		String name=t.getName();
		for( int i=0;i<=10;i++) {
			System.out.println(i+" "+name);
			try {
				th.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			}
		

	}

}
