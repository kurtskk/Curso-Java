package entities;

import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;
import entities.Comment;
import java.time.format.DateTimeFormatter;


public class Post {

	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

	private LocalDateTime _date;
	private String _title;
	private String _content;
	private Integer _likes;
	private List<Comment> _comments = new ArrayList<>();

	public Post(LocalDateTime date, String title, String content, Integer likes) {
		_date = date;
		_title = title;
		_content = content;
		_likes = likes;
	}

	public LocalDateTime getDate() {
		return _date;
	}

	public void setDate(LocalDateTime date) {
		_date = date;
	}

	public void setTitle(String title) {
		_title = title;
	}

	public String getTitle() {
		return _title;
	}

	public void setContent(String content) {
		_content = content;
	}

	public String getContent() {
		return _content;
	}

	public Integer getLikes()  {
		return _likes;
	} 

	public void setLikes(Integer likes) {
		_likes = likes;
	}

	public void addComment(Comment comments) {
		_comments.add(comments);
	}

	public void removeComment(Comment comments) {
		_comments.remove(comments);
	}

	public List<Comment> getComment() {
		return _comments;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(_title + "\n");
		sb.append(_likes);
		sb.append(" Likes - ");
		sb.append(fmt.format(_date) + "\n");
		sb.append(_content + "\n");
		sb.append("Comments:\n");
		for (Comment c : _comments) {
			sb.append(c.getText() + "\n");
		}
		return sb.toString();

	}
}