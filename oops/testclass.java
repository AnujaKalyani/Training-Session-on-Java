package sak.com;

public class testclass {

	public static void main(String[] args) {
		car c1=new car();
		//c1.speed=10;
		//System.out.println(c1.speed);
		c1.setSpeed(10);
		c1.setDoors("closed");
		c1.setDriver("seated");
		c1.setEngine("on");
		System.out.println("Speed  "+c1.getSpeed());
		System.out.println("Doors  "+c1.getDoors());
		System.out.println("Driver "+c1.getDriver());
		System.out.println("Engine "+c1.getEngine());
		System.out.println("car is "+c1.run());

	}

}
