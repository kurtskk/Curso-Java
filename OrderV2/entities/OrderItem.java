package entities;

import entities.Product;
import entities.Client;
import entities.OrderItem;
import entities.enums.OrderStatus;

public class OrderItem {

	private Integer _quantity;
	private Double _price;
	private Product _product;

	public OrderItem(Integer quantity, Double price, Product product) {
		_quantity = quantity;
		_price = price;
		_product = product;
	}

	public void setQuantity(Integer quantity) {
		_quantity = quantity;
	}

	public Integer getQuantity() {
		return _quantity;
	}

	public void setPrice(Double price) {
		_price = price;
	}

	public Double getPrice() {
		return _price;
	}

	public void setProduct(Product product) {
		_product = product;
	}

	public Product getProduct() {
		return _product;
	}

	public Double subTotal() {
		return _price * _quantity;
	}

	public String toString() {
		return _product.getName()
				+ ", $"
				+ String.format("%.2f", _product.getPrice())
				+ ", Quantity: "
				+ _quantity
				+ ", Subtotal: $"
				+ String.format("%.2f", subTotal());
	}
}