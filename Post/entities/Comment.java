package entities;

public class Comment {

	private String _text;

	public Comment(String text) {
		_text = text;
	}

	public void setText(String text) {
		_text = text;
	}

	public String getText() {
		return _text;
	}
}