package entities;

public class Student {

	public String _name;
	public double _grade1;
	public double _grade2;
	public double _grade3;

	public double finalGrade() {
		return _grade1 + _grade2 + _grade3;
	}
	
	public double missingPoints() {
		if (finalGrade() < 60.00) {
			return 60.00 - finalGrade();
		}
		else {
			return 0.00;
		}
	}
}