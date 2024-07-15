package sak.com;

public class figure {
    double dimension1;
    double dimension2;

    figure(double x, double y) {
        dimension1 = x;
        dimension2 = y;
    }

    double area() {
        System.out.println("Area of figure is undefined");
        return 0;
    }

    public static void main(String args[]) {
        Triangle t1 = new Triangle(2, 3);
        Rectangle r1 = new Rectangle(3, 4);

        System.out.println(t1.area());
        System.out.println(r1.area());
    }
}

class Rectangle extends figure {
    Rectangle(double x, double y) {
        super(x, y);
    }

    double area() {
        System.out.println("Area of rectangle is:");
        return dimension1 * dimension2;
    }
}

class Triangle extends figure {
    Triangle(double x, double y) {
        super(x, y);
    }

    double area() {
        System.out.println("Area of triangle is:");
        return dimension1 * dimension2 / 2;
    }
}
