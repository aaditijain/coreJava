package com.aaditi.immutable;

public class Address {
	private String Street;
	private int AddressId;

	public Address(int addressId, String Street) {
		this.AddressId = addressId;
		this.Street = Street;
	}

	public int getAddressId() {
		return AddressId;
	}

	public void setAddressId(int addressId) {
		AddressId = addressId;
	}

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}
}
