package staticSTATIC;

/**
 * @author Renjith
 * https://beginnersbook.com/2013/05/static-constructor/
 *
 */
public class StaticTest
{
     /* See below - I have marked the constructor as static */
     public /*static*/ StaticTest()
     {
         System.out.println("Static Constructor of the class");
     }
     public static void main(String args[])
     {
         /*Below: I'm trying to create an object of the class
          *that should invoke the constructor
          */
         StaticTest obj = new StaticTest();
     }
}