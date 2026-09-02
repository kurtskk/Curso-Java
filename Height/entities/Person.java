package entities;

public class Person {

	private String _name;
	private int _age;
	private double _height;

	public Person(String name, int age, double height) {
		_name = name;
		_age = age;
		_height = height;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getName() {
		return _name;
	}

	public void setAge(int age) {
		_age = age;
	}

	public int getAge() {
		return _age;
	}

	public void setHeight(double height) {
		_height = height;
	}

	public double getHeight() {
		return _height;
	}

}