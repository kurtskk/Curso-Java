package entities;

public class Rectangle {

	public double _width;
	public double _height;

	public double area() {
		return _width * _height;
	}
	
	public double perimeter() {

		return 2 * (_width + _height);
	}

	public double diagonal() {
		
		double b = Math.pow(_width, 2);
		double l = Math.pow(_height, 2);
		double sum = b + l;
		double diagonal = Math.sqrt(sum);
		return (diagonal);
	}

	public String toString() {

		return "AREA = " + String.format("%.2f", area())
		+ "\nPERIMETER = " + String.format("%.2f", perimeter())
		+ "\nDIAGONAL = "  + String.format("%.2f", diagonal());
	}
}