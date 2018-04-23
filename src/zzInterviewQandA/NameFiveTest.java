package zzInterviewQandA;

public class NameFiveTest {

	public static boolean equalsOutside(Object o, Object oo) {
		//String x = ((NameFour) o).getLastName();
		String x = ((NameFive) o).lastName;
		//if (lastName.equals(x))	{
		if (((NameFive) oo).lastName==x)	{	
		return true;}
		return false;
	   }
	
	public boolean equalsOutside2(Object o, Object oo) {
		//String x = ((NameFour) o).getLastName();
		String x = ((NameFive) o).lastName;
		//if (lastName.equals(x))	{
		if (((NameFive) oo).lastName==x)	{	
		return true;}
		return false;
	   }
	
	
	
	
	public static void main(String[] args) {
		NameFive name1 = new NameFive("John", "Doe");
		NameFive name2 = new NameFive("John", "Doe");
		NameFive name3 = name1;
		
		 //System.out.println(name1==name2);//false
		 System.out.println(equalsOutside(name1, name2));//true
		 
		 NameFiveTest nameFiveTest = new NameFiveTest();
		 System.out.println(nameFiveTest.equalsOutside2(name1, name2));//true
		// System.out.println(name1==name3);//true
		
	}
	
}