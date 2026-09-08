package entities;

import java.util.Date;
import entities.enums.OrderStatus;

public class Order {

	private Integer _id;
	private Date _moment;
	private OrderStatus _status;

	public Order(Integer id, Date moment, OrderStatus status) {
		_id = id;
		_moment = moment;
		_status = status;
	}

	public void setId(Integer id) {
		_id = id;
	}

	public Integer getId() {
		return _id;
	}

	public void setMoment(Date moment) {
		_moment = moment;
	}

	public Date getMoment() {
		return _moment;
	}

	
	public void setStatus(OrderStatus status) {
		_status = status;
	}

	public OrderStatus getStatus() {
		return _status;
	}

	public String toString() {
		return "ORDER id = " + _id + ", moment = " + _moment + ", Status = " + _status;
	}
}