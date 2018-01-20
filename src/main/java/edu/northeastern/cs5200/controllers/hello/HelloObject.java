package edu.northeastern.cs5200.controllers.hello;

public class HelloObject {
	private String message;
	public HelloObject() {
}
public HelloObject(String message) {
	super();
	this.message=message;
}

public String getmessage() {
	return message;
}
public void setmessage(String message) {
	this.message=message;
}
}
