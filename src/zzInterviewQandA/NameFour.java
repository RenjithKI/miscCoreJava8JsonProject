package zzInterviewQandA;

public class NameFour {

	private String firstName;
	private String lastName;	 

	/*public String getLastName() {
		return lastName;
	}*/
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public NameFour(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public boolean equals(Object o) {
		//String x = ((NameFour) o).getLastName();
		String x = ((NameFour) o).lastName;
		//if (lastName.equals(x))	{
		if (lastName==x)	{	
		return true;}
		return false;
	   }
	
	public static void main(String[] args) {
		NameFour name1 = new NameFour("John", "Doe");
		NameFour name2 = new NameFour("John", "Doe");
		NameFour name3 = name1;
		
		 System.out.println(name1==name2);//false
		 System.out.println(name1.equals(name2));//true
		 System.out.println(name1==name3);//true
		
	}
	
}