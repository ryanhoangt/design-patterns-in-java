package com.edocode.dp.creational.builder;

// A product in builder pattern
// Also an immutable class
public class UserWebDTO implements UserDTO {

	private final String name;
	
	private final String address;
	
	private final String age;

	public UserWebDTO(String name, String address, String age) {
		this.name = name;
		this.address = address;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "name=" + name + "\nage=" + age + "\naddress=" + address ;
	}
	
	
}
