package sak.com;

public class testcar {

	public static void main(String[] args) {
		car c1=new car();
		c1.setSpeed(12);
		c1.setDoors("close");
		c1.setEngine("on");
		c1.setDriver("seated");
		System.out.println(c1.run());
	}

}
