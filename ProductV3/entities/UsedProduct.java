package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends ProductV3 {

    private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private LocalDate _manuFactureDate;

    public UsedProduct(String name, Double price, LocalDate manuFactureDate) {
        super(name, price);
        _manuFactureDate = manuFactureDate;
    }

    @Override
    public String priceTag() {
        return getName() + " (used) $ " + getPrice() + " (Manufacture date: " + _manuFactureDate.format(fmt) + ")";
    }
}