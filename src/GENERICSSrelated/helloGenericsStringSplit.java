package GENERICSSrelated;

public class helloGenericsStringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi _______________________>");
		
		
		
		String s = "abcdefg<br>kkkkkk";
		
		String[] sa = s.split("*<");
		for (int i = 0; i < sa.length; i++) {
			System.out.println( sa[i]);
		}
		
		System.out.println();

	}

}
