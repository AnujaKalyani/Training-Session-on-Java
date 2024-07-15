package sak.com;
abstract class Figure{
	double dimension1;
	double dimension2;
	
	Figure(double x,double y){
		dimension1=x;
		dimension2=y;
	}
	abstract double area();
	
}
class Rectangle extends Figure{

	Rectangle(double x, double y) {
		super(x, y);
		
	}

	@Override
	double area() {
		System.out.println("Area of Rectangle is:");
		
		return dimension1*dimension2;
	}
	
}

class Triangle1 extends Figure{

	Triangle1(double x, double y) {
		super(x, y);
		
	}

	@Override
	double area() {
		System.out.println("Area of Triangle is :");
		
		return dimension1*dimension2/2;
	}
	
}
public class AbsDemo {

	public static void main(String[] args) {
		Rectangle r=new Rectangle(12,20);
		Triangle1 t=new Triangle1(20,30);
		System.out.println(r.area());
		System.out.println(t.area());
		
		
	}

}
