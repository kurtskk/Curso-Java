package entities;

public class Employee {

    private String _name;
    private Integer _hours;
    private Double _valuePerHour;

    public Employee(String name, Integer hours, Double valuePerHour) {
        _name = name;
        _hours = hours;
        _valuePerHour = valuePerHour;
    }

	public String getName() {
		return _name;
	}

	public Integer getHours() {
		return _hours;
	}

	public Double getvaluePerHour() {
		return _valuePerHour;
	}

    public double payment() {
        return _hours * _valuePerHour;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(_name)
          .append(" - $ ")
          .append(String.format("%.2f", payment()));

        return sb.toString();
    }
}