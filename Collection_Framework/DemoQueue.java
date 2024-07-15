package collectionfam.com;

import java.util.LinkedList;
import java.util.Queue;

public class DemoQueue {

	public static void main(String[] args) {
		Queue<Integer> queue=new LinkedList<>();
		queue.offer(12);
		queue.offer(24);
		queue.offer(45);
		queue.offer(56);
		System.out.println(queue);
		queue.poll();//remove first element from queue
		System.out.println(queue);
		
		System.out.println(queue.peek());
		
		

	}

}
