package com.osy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
* @author 作者 E-mail11ddd111是滴爱的、:
* @version 创建时间：2019年1月16日 上午10:17:09
* 类说明
*/
@Table(name="JPA_CUSTOMERS")
@Entity
public class Customer {
	private Integer id;
	private String lastName;
	private String email;
	private Integer age;
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Column(name="LAST_NAME")
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", lastName=" + lastName + ", email=" + email + ", age=" + age + "]";
	}
	public Customer(String lastName, Integer age) {
		super();
		this.lastName = lastName;
		this.age = age;
	}
	
}
