package com.harsha.java8;

import java.util.List;

public class Student {

	private int id;
	private String name;
	private String gender;
	private String dept;
	private String city;
	private int age;
	private int rank;
	private List<Long> contacts;

	public Student(int id, String name, String gender, String dept, String city, int age, int rank,
			List<Long> contacts) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.dept = dept;
		this.city = city;
		this.age = age;
		this.rank = rank;
		this.contacts = contacts;
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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public List<Long> getContacts() {
		return contacts;
	}

	public void setContacts(List<Long> contacts) {
		this.contacts = contacts;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", dept=" + dept + ", city=" + city
				+ ", age=" + age + ", rank=" + rank + ", contacts=" + contacts + "]";
	}

}
