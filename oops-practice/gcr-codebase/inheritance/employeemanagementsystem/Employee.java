package com.inheritance.introduction.employeemanagementsystem;

public class Employee {
	private int id;
	private String name;
	private double salary;
	
	public void setName(String name){
		this.name= name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setId(int id) {
		this.id= id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setSalary(double salary) {
		this.salary= salary;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void displayDetails() {
        System.out.println("ID: "+ id +", Name: "+ name +", Salary: ₹"+ salary);
    }
	
}