package edu.fju.exam;

public class Director extends Manager {
	public Director(String name, int salary, int Bonus){
		this.name=name;
		this.salary=salary;
		this.Bonus=Bonus;
	}
	@Override
	public void print(){
		System.out.println(name+"\t"+(salary+5000)+"("+Bonus+")");
	}
}
