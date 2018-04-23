/*package zzzJackson2Convert_JavaObjectto_fromJSON;

*//**http://www.oracle.com/technetwork/articles/java/ma14-java-se-8-streams-2177646.html
 * @author Renjith
 *
 *//*
public class FIXnnn10 {
	
    
     * Complete the oddNumbers function below.
     
    static int[] oddNumbers(int l, int r) {
        
        List<Integer> result = new ArrayList<>();
         int[] anss;
       for (int i = l; i < r+1; i++) {
           if (i%2==1){
           result.add(i);			
               }
		}
        if (result.size()==0)
            return null;
        else {
           //
           anss = result.toArray;
            }
        return anss;

    }

	public static void main(String[] args) {
		 public static void main(String[] args) throws IOException {
		        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		        int l = scanner.nextInt();
		        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

		        int r = scanner.nextInt();
		        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

		        int[] res = oddNumbers(l, r);

		        for (int resItr = 0; resItr < res.length; resItr++) {
		            bufferedWriter.write(String.valueOf(res[resItr]));

		            if (resItr != res.length - 1) {
		                bufferedWriter.write("\n");
		            }
		        }

		        bufferedWriter.newLine();

		        bufferedWriter.close();

		        scanner.close();
		    }

	}

}
*/