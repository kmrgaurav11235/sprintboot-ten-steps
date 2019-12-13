package com.gaurav;

public class Author {
	private String name;
	private String address;
	
	public Author(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Author [name=" + name + ", address=" + address + "]";
	}
	
}
