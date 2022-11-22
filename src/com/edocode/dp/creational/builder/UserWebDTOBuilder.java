package com.edocode.dp.creational.builder;

import java.time.*;

//The concrete builder for UserWebDTO
public class UserWebDTOBuilder implements UserDTOBuilder {
	
	private String fName;
	private String lName;
	private String age;
	private String address;
	private UserWebDTO dto;
	
	@Override
	public UserDTOBuilder withFirstName(String fname) {
		this.fName = fname;
		return this;
	}

	@Override
	public UserDTOBuilder withLastName(String lname) {
		this.lName = lname;
		return this;
	}

	@Override
	public UserDTOBuilder withBirthday(LocalDate date) {
		Period ageInYears = Period.between(date, LocalDate.now());
		this.age = Integer.toString(ageInYears.getYears());
		return this;
	}

	@Override
	public UserDTOBuilder withAddress(Address address) {
		this.address = address.getHouseNumber() + ", " + address.getStreet() + "\n"
						+ address.getCity() + "\n"
						+ address.getState() + " " + address.getZipcode();
		return this;
	}

	@Override
	public UserDTO build() {
		this.dto = new UserWebDTO(fName + " " + lName, address, age);
		return dto;
	}

	@Override
	public UserDTO getUserDTO() {
		return dto;
	}
	
}
