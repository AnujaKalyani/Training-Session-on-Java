package collectionfam.com;

import java.util.Stack;

public class DemoStack {

	public static void main(String[] args) {
		Stack<String> animal=new Stack<>();
		animal.push("lion");
		animal.push("Dog");
		animal.push("Tiger");
         System.out.println(animal);
         System.out.println(animal.peek());
         System.out.println(animal.pop());
         System.out.println(animal);
	}

}
