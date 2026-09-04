package entities;

public class Employee {

	private Integer _id;
	private String _name;
	private Double _salary;

	public Employee(Integer id, String name, Double salary) {
		_id = id;
		_name = name;
		_salary = salary;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public Integer getId() {
		return _id;
	}

	public void setId(Integer id) {
		_id = id;
	}

	public Double getSalary() {
		return _salary;
	}

	public void salaryIncrease(Double amount) {
		_salary += _salary * (amount / 100); 
	}

	public String toString() {
		return _id + ", " + _name + ", " + String.format("%.2f", _salary);
	}
}