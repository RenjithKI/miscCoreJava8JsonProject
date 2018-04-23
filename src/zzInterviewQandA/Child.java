package zzInterviewQandA;

public class Child extends Parent {

	 private String custometType;
	
	public Child(String cType) {
		super();
		this.custometType = cType;		
	}
	public Child(String n, int a, String cType) {
		super(n,a);
		this.custometType = cType;
	}

	public String getNameLenth() {	
//		int a= name.length();
//		String s = String.valueOf(name.length());
		return String.valueOf(name.length());		 
	}
	
	
	
}