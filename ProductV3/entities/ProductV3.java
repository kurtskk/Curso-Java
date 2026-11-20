package entities;

public class ProductV3 {

    private String _name;
    private Double _price;

    public ProductV3(String name, Double price) {
        _name = name;
        _price = price;
    }

    public Double getPrice() {
        return _price;
    }

    public String getName() {
        return _name;
    }

    public String priceTag() {
        return _name + " $ " + _price;
    }

}