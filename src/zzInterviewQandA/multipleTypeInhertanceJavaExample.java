package zzInterviewQandA;

/**http://www.oracle.com/technetwork/articles/java/ma14-java-se-8-streams-2177646.html
 * @author Renjith
 *
 */
interface X
{
   public void myMethod();
}
interface Y
{
   public void myMethod();
}
public class multipleTypeInhertanceJavaExample implements X, Y
{
   public void myMethod()
   {
       System.out.println("Implementing more than one interfaces");
   }
   public static void main(String args[]){
	   multipleTypeInhertanceJavaExample obj = new multipleTypeInhertanceJavaExample();
	   obj.myMethod();
   }
}
