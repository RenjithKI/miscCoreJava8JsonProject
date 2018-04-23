package zzInterviewQandA;

public abstract  class Parent {
	 protected String name;
	 protected int age;	 
	 protected String type;
	 
	public Parent() {}
	
	public Parent(String name, int age) {	
		this.name = name;
		this.age = age;		
	}
	
	public abstract String getNameLenth();	
}