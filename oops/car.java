package sak.com;

public class car {
	private String doors;

	 private String engine;

	 private String driver;

	 public int speed;

	 //constructor
	 

	 public car() {

	  doors="opend";

	  engine="off";

	  driver="Absent";

	  speed =0;

	 }

	 //overloading constructor here to initilized the custom properties

	public car(String doors, String engine, String driver, int speed) {

	 super();

	 this.doors = doors;

	 this.engine = engine;

	 this.driver = driver;

	 this.speed = speed;

	 }

	 //getter and setter

	 public void setSpeed(int speed) {

	  this.speed= speed;

	 }

	  public int getSpeed() {

	  return speed;

	 }

	 public String getDoors() {

	 return doors;

	 }

	 public void setDoors(String doors) {

	 this.doors = doors;

	 }

	 public String getEngine() {

	 return engine;

	 }

	 public void setEngine(String engine) {

	 this.engine = engine;

	 }

	 public String getDriver() {

	 return driver;

	 }

	 public void setDriver(String driver) {

	 this.driver = driver;

	 }

	 public String run() {

	 if(doors.equals("closed") && engine.equals("on") && driver.equals("seated") && speed>0 ) {

	 return "running";

	 }else {

	 return "stop";

	 }

	}
	

}
