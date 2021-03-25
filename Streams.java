package com.amfam.tpi.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee
{
	private int id;
	private int name;
	private double salary;
	public Employee(int i, int j, double d) {
		this.id=i;
		this.name=j;
		this.salary=d;
		
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public int getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(int name) {
		this.name = name;
	}
	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
public class Streams {
	
	
	public static void main(String[] args) {
		
		List<Employee> employees=new ArrayList<>();
		employees.add(new Employee(1,1,89.0));
		employees.add(new Employee(2,2,90.0));
		employees.add(new Employee(3,3,90.0));
		
		Double d=employees.stream().map(Employee::getSalary).peek(System.out::println).reduce(0.0,Double::sum);
		System.out.println(employees.stream().count());
		System.out.println(d);

	}

}
