package yyyjava8.misc;

import java.math.BigDecimal;

public class Developer {
	
	String name;
	BigDecimal salary;
	int age;
	
	
	
	@Override
	public String toString() {
		return "Developer [name=" + name + ", salary=" + salary + ", age=" + age + "]";
	}
	public Developer(String name, BigDecimal salary, int age) {
		super();
		this.name = name;
		this.salary = salary;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	

	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}

}
