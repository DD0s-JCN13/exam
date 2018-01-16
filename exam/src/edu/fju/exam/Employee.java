package edu.fju.exam;

public class Employee {
	String name;
	int salary;
	int Bonus;
	public Employee(){
		
	}
	public Employee(String name, int salary){
		this.name=name;
		this.salary=salary;
	}
	public void print(){
		System.out.println(name+"\t"+salary);
	}

}
