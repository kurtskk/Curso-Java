package entities;

import java.util.List;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;
import entities.Client;
import entities.OrderItem;
import java.time.LocalDate;
import java.time.LocalDateTime;
import entities.enums.OrderStatus;
import entities.Product;

public class Order {

	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	private static DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	private LocalDateTime _moment;
	private OrderStatus _status;
	private Client _client;
	private List<OrderItem> _orderItem = new ArrayList<>();

	public Order(LocalDateTime moment, OrderStatus status, Client client) {
		_moment = moment;
		_status = status;
		_client = client;
	}

	public void setMoment(LocalDateTime moment) {
		_moment = moment;
	}

	public LocalDateTime getMoment() {
		return _moment;
	}

	public void addItem(OrderItem item) {
		_orderItem.add(item);
	}

	public void removeItem(OrderItem item) {
		_orderItem.remove(item);
	}

	public void setClient(Client client) {
		_client = client;
	}

	public Client getClient() {
		return _client;
	}

	public void setStatus(OrderStatus status) {
		_status = status;
	}

	public OrderStatus getStatus() {
		return _status;
	}

	public Double total() {
		Double sum = 0.0;
		for (OrderItem c: _orderItem) {
			sum += c.subTotal();
		}
		return sum;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("ORDER SUMMARY:\n");
		sb.append("Order moment: " + _moment.format(fmt) + "\n");
		sb.append("Order status: " + _status + "\n");
		sb.append("Client: " + _client.getName() + " (" 
				+ _client.getDate().format(fmt1) + ") - "
				+ _client.getEmail() + "\n");

		sb.append("Order items:\n");

		for (OrderItem c : _orderItem) {
			sb.append(c + "\n");
		}

		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));

		return sb.toString();
	}
}