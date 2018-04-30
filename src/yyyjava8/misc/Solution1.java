package yyyjava8.misc;
/*package zzzJackson2Convert_JavaObjectto_fromJSON;

*//**http://www.oracle.com/technetwork/articles/java/ma14-java-se-8-streams-2177646.html
 * @author Renjith
 *
 *//*
public class Solution1 {

	public static void main(String[] args) {
		
		 * 
		 * 
		 * 
		 * 
public class Solution {
    /*    
    *import com.google.gson.JsonObject;
    import com.google.gson.JsonArray; 
     * Complete the function below.    
     

    static String[] getMovieTitles(String substr) {        
         
         ArrayList<String> movietitleList = new ArrayList<>();
        
         int total = 0;
         int totalPages = 0;
         int currantPage =0;
         int per_page_count =0;
        
          comment 
        	String jsonString = callURL("https://jsonmock.hackerrank.com/api/movies/search/?Title=Spiderman");
             System.out.println("\n\njsonString: " + jsonString);
            for (int i = 0; i < args.length; i++) {

            }
 
        // use google api to parse the result json here below
                try { 
                    JsonObject jsonObject = new JsonObject(jsonString);// result need to double check
                     // parsed header info here and saved in variables
                         total = jsonObject.get("total");
                         totalPages = jsonObject.get("total_pages");
                    
                         currantPage = jsonObject.get("page");
                         per_page_count = jsonObject.get("per_page");                                                         
            
                        // initialized the titles array here with toatal int count              
                         //String[] titles = new String[total];
                    
                           comment   data  
                    
                    
                    JsonArray jsonArray = new JsonArray(jsonObject.get("data"));// result need to double check
                    System.out.println("\n\njsonArray with data elements: ___>" + jsonArray);
                    
                    int count = jsonArray.length(); // get totalCount of all jsonObjects                   
                    
			         for(int i=0 ; i< count; i++)
                            {   // iterate through jsonArray 
                         
                         
                            JsonObject jsonObject = jsonArray.getJSONObject(i);  // get jsonObject @ i position 

                            System.out.println("jsonObject " + i + ": " + jsonObject);
                                     movietitleList.add(jsonObject.get("Title"));//// fill collection /array with titles of the movie
                            }
                    
                         movietitleList.sort();// sort in the natural ascending order here
                        //  titles[i] =  jsonObject.get("Title");// fill collection /array with titles of the movie
                        
                         
                
                } catch (JsonParseException e) {
                    e.printStackTrace();
                }                  
                   
             return movietitleList.toArray();
                    
	}


//new method added to call the url for the result 
	 static String callURL(String myURL) {
		System.out.println("Requested URL:" + myURL);
		StringBuilder sb = new StringBuilder();
		URLConnection urlConn = null;
		InputStreamReader in = null;
		try {
			URL url = new URL(myURL);
			urlConn = url.openConnection();
			if (urlConn != null)
				urlConn.setReadTimeout(60 * 1000);
			if (urlConn != null && urlConn.getInputStream() != null) {
				in = new InputStreamReader(urlConn.getInputStream(),
						Charset.defaultCharset());
				BufferedReader bufferedReader = new BufferedReader(in);
				if (bufferedReader != null) {
					int cp;
					while ((cp = bufferedReader.read()) != -1) {
						sb.append((char) cp);
					}
					bufferedReader.close();
				}
			}
		in.close();
		} catch (Exception e) {
			throw new RuntimeException("Exception while calling URL:"+ myURL, e);
		} 
 
		return sb.toString();
	}

//ends here
    }
*/
