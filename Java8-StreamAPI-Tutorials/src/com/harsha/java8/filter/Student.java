package com.harsha.java8.filter;

import java.util.List;
import java.util.Objects;

public class Student {

	private int id;
	private String name;
	private String gender;
	private String city;
	private int rank;
	private List<Long> contact;

	public Student(int id, String name, String gender, String city, int rank, List<Long> contact) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.city = city;
		this.rank = rank;
		this.contact = contact;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public List<Long> getContact() {
		return contact;
	}

	public void setContact(List<Long> contact) {
		this.contact = contact;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", city=" + city + ", rank=" + rank
				+ ", contact=" + contact + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(contact, gender, id, name, rank);
	}

}
