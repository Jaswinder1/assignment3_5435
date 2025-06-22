package com.library.assignment2.model;

import org.springframework.data.annotation.Id;

public class Publisher{
	@Id
	private int pub_Id;
	private String name;
	private Address address;
	

	public Publisher() {}
	
	public Publisher(int pub_Id,String name,Address address) {
		this.address=address;
		this.pub_Id=pub_Id;
		this.name=name;
		
	}
	public int getPub_Id() {
		return pub_Id;
	}

	public void setPub_Id(int pub_Id) {
		this.pub_Id = pub_Id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Publisher [pub_ID=" + pub_Id + ", name=" + name+  ", address=" + address + "]";
	}

	// Static inner class for address
	public static class Address {
		private String number;
		private String street;

		public Address() {}

		public Address(String number, String street) {
			this.number = number;
			this.street = street;
		}

		public String getNumber() {
			return number;
		}

		public void setNumber(String number) {
			this.number = number;
		}

		public String getStreet() {
			return street;
		}

		public void setStreet(String street) {
			this.street = street;
		}

		@Override
		public String toString() {
			return "Address [number=" + number + ", street=" + street + "]";
		}
	}
	
	
}