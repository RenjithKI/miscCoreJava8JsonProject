package zzInterviewQandA_Reflection;

import java.lang.reflect.Method;

import sun.reflect.ConstructorAccessor;

import java.lang.reflect.Constructor;

/**http://www.oracle.com/technetwork/articles/java/javareflection-1536171.html
 * @author Renjith
 *
 */
/*import java.lang.reflect.*;*/

public class DumpMethods3 {
   public static void main(String args[])
   {
      try {
        // Class c = Class.forName(args[0]);//java.util.Stack
        // Class c = Class.forName("java.util.Stack");//java.util.Stack
         Class c = Class.forName("java.lang.String");//java.util.Stack
         
         System.out.println("____________"+c);
         
         Method m[] = c.getDeclaredMethods();
         for (int i = 0; i < m.length; i++)
         System.out.println(m[i].toString());
         
         System.out.println("______constructor list_____________");
         
         Constructor constructor[] = c.getDeclaredConstructors();
         for (int i = 0; i < constructor.length; i++)
         System.out.println(constructor);
         
         System.out.println("___________ends________");
         
      }
      catch (Throwable e) {
         System.err.println(e);
      }
   }
}
