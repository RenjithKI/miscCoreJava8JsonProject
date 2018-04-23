package zzInterviewQandA;

public class NameFourTest {	
	public static void main(String[] args) {
		NameFour name1 = new NameFour("John", "Doe");
		NameFour name2 = new NameFour("John", "Doe1");
		NameFour name3 = name1;
		
		 //System.out.println(name1==name2);//false
		 System.out.println(name1.equals(name2));//true
		// System.out.println(name1==name3);//true
		
	}
	
}