package zzInterviewQandA;

/**http://www.oracle.com/technetwork/articles/java/ma14-java-se-8-streams-2177646.html
 * @author Renjith
 *Why are interface variables static and final by default in Java?
 */
interface XX
{
   public void myMethod();
   //Why are interface variables static and final by default in Java?
   int x = 5;
}
interface YY
{
   public void myMethod();
   int xx = 5;
}
public class multipleTypeInhertanceJavaExample2 implements XX, YY
{
   public void myMethod()
   {
       System.out.println("Implementing more than one interfaces");
   }
   public static void main(String args[]){
	   multipleTypeInhertanceJavaExample2 obj = new multipleTypeInhertanceJavaExample2();
	   obj.myMethod();
	  // x= 7;
	   System.out.println(x);
   }
}
