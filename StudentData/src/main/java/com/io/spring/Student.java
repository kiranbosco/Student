package com.io.spring;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="student")
public class Student {
	@Id
	
	private String age;
	private String name;
	private String id;
	private String phoneNo;
	
	public Student(String age, String name, String id, String phoneNo) {
		super();
		this.age = age;
		this.name = name;
		this.id = id;
		this.phoneNo = phoneNo;
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
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}


}
