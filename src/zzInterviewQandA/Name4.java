package zzInterviewQandA;

public class Name4 {

	 private String firstName;
	 public String lastName;	 

	public String getLastName() {
		return lastName;
	}
	public void setLastName(final String lastName) {
		//lastName= "kkkk";
		this.lastName = lastName;
		this.lastName = "neethu";
	}
	public Name4(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public boolean equals(Object o) {
	     // System.out.println("Inside Square::draw() method.");
		String x = ((Name4) o).getLastName();
		//if (lastName.equals(x))	{
		if (lastName==x)	{	
		return true;}
		return false;
	   }
	
	public static void main(String[] args) {
		Name4 name1 = new Name4("John", "Doe");
		Name4 name2 = new Name4("John", "Doe");
		Name4 name3 = name1;
		
		 System.out.println(name1==name2);//false
		 System.out.println(name1.equals(name2));//true
		 System.out.println(name1==name3);//true
		 
		 
		 
		 name1.setLastName("hiii");
		 System.out.println(name1.getLastName());//true
		
	}
	
}