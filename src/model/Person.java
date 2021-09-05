package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Person {
	private String name;
	private String id;
	private boolean state;
	private LocalDateTime date;
	
	DateTimeFormatter datetf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	
	public Person(String name, String id, boolean state, LocalDateTime date) {
		this.name = name;
		this.id = id;
		this.state = state;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public boolean isState() {
		return state;
	}

	public LocalDateTime getDate() {
		return date;
	}
	
	public String toString() {
		String info = "";
		info += name+"\n";
		info += id+"\n";
		info += datetf.format(date)+"\n";
		return info;
	}
	
}
