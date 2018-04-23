package zzInterviewQandA;

public class Name {

	 private String firstName;
	 public String lastName;	 

	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Name(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public boolean equals(Object o) {
	     // System.out.println("Inside Square::draw() method.");
		String x = ((Name) o).getLastName();
		if (lastName.equals(x))	{	
		return true;}
		return false;
	   }
	
	public static void main(String[] args) {
		Name name1 = new Name("John", "Doe");
		Name name2 = new Name("John", "Doe2");
		Name name3 = name1;
		
		 System.out.println(name1==name2);//false
		 System.out.println(name1.equals(name2));//true
		 System.out.println(name1==name3);//true
		
	}
	
}