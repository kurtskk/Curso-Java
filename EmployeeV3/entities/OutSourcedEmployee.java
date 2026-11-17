package entities;

public class OutSourcedEmployee extends Employee {
    private Double _additionalCharge;

    public OutSourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        _additionalCharge = additionalCharge;
    }

    public  Double getadditionalCharge(){
        return _additionalCharge;
    }

    @Override
    public double payment() {
        return super.payment() + _additionalCharge * 1.1;
    }
}