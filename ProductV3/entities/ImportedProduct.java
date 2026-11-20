package entities;

public class ImportedProduct extends ProductV3 {

    private Double _customsFee;

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        _customsFee = customsFee;
    }

    public Double totalPrice() {
        return getPrice() + _customsFee;
    }

    @Override
    public String priceTag() {
        return getName() + " $ " + totalPrice() + "(Customs fee: $ " + _customsFee + ")";
    }
}