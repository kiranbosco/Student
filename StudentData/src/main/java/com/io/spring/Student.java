package com.io.spring;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="student")
public class Student {
	@Id
	
	private int id;
	private String age;
	private String name;
	private String phoneNo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", age=" + age + ", name=" + name + ", phoneNo=" + phoneNo + "]";
	}
	public Student(int id, String age, String name, String phoneNo) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.phoneNo = phoneNo;
	}

	
}