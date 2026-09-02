package entities;

public class Rent {

	private String _name;
	private String _email;

	public Rent(String name, String email) {
		_name = name;
		_email = email;
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

}