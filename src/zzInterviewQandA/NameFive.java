package zzInterviewQandA;
public class NameFive {
	private String firstName;
	String lastName;	
	
	public NameFive(String firstName, String lastName) {	
		this.firstName = firstName;
		this.lastName = lastName;
	}	
	public boolean equals(Object o) {
		//String x = ((NameFour) o).getLastName();
		String x = ((NameFive) o).lastName;
		//if (lastName.equals(x))	{
		if (lastName==x)	{	
		return true;}
		return false;
	   }
	
	/*public static void main(String[] args) {
		NameFive name1 = new NameFive("John", "Doe");
		NameFive name2 = new NameFive("John", "Doe");
		NameFive name3 = name1;
		
		// System.out.println(name1==name2);//false
		 System.out.println(name1.equals(name2));//true
		// System.out.println(name1==name3);//true
		
	}*/
	
}