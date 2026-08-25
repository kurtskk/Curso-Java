package entities;

public class Product {

	public String _name;
	public double _price;
	public int _quantity;

	public double totalValueStock() {
		return  _price * _quantity;
	}

	public void addProduct(int quantity) {
		this._quantity += quantity;
	}

	public void removeProduct(int quantity) {
		this._quantity -= quantity;
	}

	public String toString() {
		return _name 
			+ ", $ "
			+ String.format("%.2f", _price) + ", "
			+ _quantity + " units, Total: $ "
			+ String.format("%.2f", totalValueStock());
	}
}