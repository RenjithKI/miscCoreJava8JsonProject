package zzInterviewQandA;

public class Name3 {

	 private String firstName;
	 public String lastName;	 

	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		lastName= "kkkk";
		this.lastName = lastName;
		this.lastName = "neethu";
	}
	public Name3(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public boolean equals(Object o) {
	     // System.out.println("Inside Square::draw() method.");
		String x = ((Name3) o).getLastName();
		//if (lastName.equals(x))	{
		if (lastName==x)	{	
		return true;}
		return false;
	   }
	
	public static void main(String[] args) {
		Name3 name1 = new Name3("John", "Doe");
		Name3 name2 = new Name3("John", "Doe");
		Name3 name3 = name1;
		
		 System.out.println(name1==name2);//false
		 System.out.println(name1.equals(name2));//true
		 System.out.println(name1==name3);//true
		 
		 
		 
		 name1.setLastName("hiii");
		 System.out.println(name1.getLastName());//true
		
	}
	
}