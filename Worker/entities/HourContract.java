package entities;

import java.time.LocalDate;

public class HourContract {

	private LocalDate _date;
	private Double _valuePerHour;
	private Integer _hours;

	public HourContract(LocalDate date, Double valuePerHour, Integer hours) {
		_date = date;
		_valuePerHour = valuePerHour;
		_hours = hours;
	}

	public void setDate(LocalDate date) {
		_date = date;
	}

	public LocalDate getDate() {
		return _date;
	}

	public void setValuePerHour(Double value) {
		_valuePerHour = value;
	}

	public Double getValuePerHour() {
		return _valuePerHour;
	}

	public Integer getHours() {
		return _hours;
	}

	public void setHours(Integer hours) {
		_hours = hours;
	}

	public Double totalValue() {
		return _valuePerHour * _hours;
	}
}