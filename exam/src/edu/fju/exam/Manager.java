package edu.fju.exam;

public class Manager extends Employee{
	int ManagerBonus=5000;
	public Manager(){
	}
	public Manager(String name, int salary){
		this.name=name;
		this.salary=salary;
	}
	@Override
	public void print(){
		System.out.println(name+"\t"+(salary+5000));
	}

}
