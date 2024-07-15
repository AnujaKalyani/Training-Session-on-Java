package collectionfam.com;

import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;

public class DeQueueDemo {

	public static void main(String[] args) {
		Deque<Integer> dequeu=new LinkedBlockingDeque<Integer>();
		dequeu.add(1);
		dequeu.add(2);
		dequeu.add(3);
		dequeu.add(4);
		dequeu.add(5);
		
		for(int element:dequeu) {
			System.out.println(element);
		}
		System.out.println("****************");
		dequeu.addFirst(0);
		System.out.println(dequeu.removeFirst());
		}

}
