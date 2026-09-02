package entities;

public class ProductV2 {

	private String _name;
	private double _price;

	public ProductV2(String name, double price) {
		_name = name;
		_price = price;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getName() {
		return _name;
	}

	public void setPrice(double price) {
		_price = price;
	}

	public double getPrice() {
		return _price;
	}


}