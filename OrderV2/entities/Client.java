package entities;

import java.util.List;
import java.util.ArrayList;
import entities.Client;
import entities.OrderItem;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import entities.enums.OrderStatus;
import entities.Product;

public class Client {

	private String _name;
	private String _email;
	private LocalDate _birthDate;

	public Client(String name, String email, LocalDate birthDate) {
		_name = name;
		_email = email;
		_birthDate = birthDate;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getName() {
		return _name;
	}

	public void setEmail(String email) {
		_email = email;
	}

	public String getEmail() {
		return _email;
	}

	public void setDate(LocalDate date) {
		_birthDate = date;
	}

	public LocalDate getDate() {
		return _birthDate;
	}


}