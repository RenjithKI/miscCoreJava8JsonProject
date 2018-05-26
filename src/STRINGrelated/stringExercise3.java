package STRINGrelated;

/**
 * @author Renjith
 *
 */
public class stringExercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st = "elwloh0";
		//int index = 0;
		String[] splitarray= st.split("h");
		System.out.println("size__"+ splitarray.length + " array___>  "
				+ splitarray[0] + " array___>  "+ splitarray[1]);
		
/*find the char that does not repeat in the string*/
		
		/*for (int i= 0; i<st.length(); i++){
			char temp = st.charAt(i);
			int xx= splitandreturnsize(temp, st.substring(i+1));
			System.out.println("xx>"+  xx+"/temp__>"+  temp+ "/substring(i+1)______>"+st.substring(i+1));
			
			if (xx==1){
				index= i;
				break;
			}
			
			
		}
		System.out.println("required anse__"+ st.charAt(index));*/

	}

	private static int splitandreturnsize(char temp, String substring) {
		// TODO Auto-generated method stub
		String[] splitarray= substring.split(String.valueOf(temp));
		return splitarray.length;
	}

}
