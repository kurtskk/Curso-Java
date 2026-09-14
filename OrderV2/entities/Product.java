package entities;

import entities.Client;
import entities.OrderItem;
import entities.enums.OrderStatus;
import entities.Product;

public class Product {

	private String _name;
	private Double _price;

	public Product(String name, Double price) {
		_name = name;
		_price = price;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getName() {
		return _name;
	}

	public void setPrice(Double price) {
		_price = price;
	}

	public Double getPrice() {
		return _price;
	}

}