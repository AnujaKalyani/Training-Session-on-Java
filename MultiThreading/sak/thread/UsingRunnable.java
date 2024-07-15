package sak.thread;
//to avoid the multiple interface we can use runnable interface
class ThreadRunnable implements Runnable{

	@Override
	public void run() {
		for( int i=0;i<=10;i++) {
			System.out.println(i);
	}
		
	}
	
}

public class UsingRunnable {

	public static void main(String[] args) {
		ThreadRunnable tr=new ThreadRunnable();
		Thread t=new Thread(tr);
		t.start();

	}

}
