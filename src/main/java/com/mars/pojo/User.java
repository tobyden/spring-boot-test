package com.mars.pojo;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

public class User {
	
	private Integer id;
	
	@NotEmpty(message = "用户名不能为空！") 
	@Length(min=5, max=50, message="最小长度为5，最大长度为20")
	private String name;
	
	@Min(value=18, message="最小年纪为18")
	@Max(value=120, message="最大年纪为120")
	private Integer age;
	
	@NotBlank
	@Length(min=5, max=50, message="最小长度为5，最大长度为50")
	private String address;

	public User() {
		super();
	}

	public User(Integer id, String name, Integer age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public User(Integer id, String name, Integer age, String address) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String toString() {
		return "User[id=" + id + ",name=" + name + ",age=" + age + ",address=" + address + "]";
	}
}
