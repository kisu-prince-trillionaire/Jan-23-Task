package com.demo.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="EmployeeDetails")
public class Employee {
	@Id
	private int id;
	private String name;
	private long salary;
	private Adress adress;

	public Employee() {
		super();
	}

	public Employee(int id, String name, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Employee(int id, String name, long salary, Adress adress) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.adress = adress;
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

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", adress=" + adress + "]";
	}

}
