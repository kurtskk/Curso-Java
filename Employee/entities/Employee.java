package entities;

public class Employee {

	public String _name;
	public double _GrossSalary;
	public double _tax;

	public double NetSalary() {
		return _GrossSalary - _tax;
	}

	public void increaseSalary(double percentage) {

		_GrossSalary += _GrossSalary * (percentage / 100.0);
	}

	public String toString() {
		return "Employee: " + _name
			+ ", $" +  String.format("%.2f", NetSalary());
	}
}