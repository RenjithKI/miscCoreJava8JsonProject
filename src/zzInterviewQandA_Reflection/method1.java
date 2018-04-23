package zzInterviewQandA_Reflection;

/**
 * @author Renjith
 *
 */
import java.lang.reflect.Method;;

public class method1 {
   private int f1(Object p, int x) throws NullPointerException
   {
      if (p == null)
         throw new NullPointerException();
      return x;
   }
     
   public static void main(String args[])
   {
      try {
        Class cls = Class.forName("zzInterviewQandA_Reflection.method1");// full name of class
     
         Method methlist[] 
           = cls.getDeclaredMethods();
         for (int i = 0; i < methlist.length;
            i++) {  
            Method m = methlist[i];
            System.out.println("name               = " + m.getName());
            System.out.println("decl class = " +
                           m.getDeclaringClass());
            Class pvec[] = m.getParameterTypes();
            for (int j = 0; j < pvec.length; j++)
               System.out.println("param #" + j + " " + pvec[j]);
            Class evec[] = m.getExceptionTypes();
            for (int j = 0; j < evec.length; j++)
               System.out.println("exc #" + j 
                 + " " + evec[j]);
            System.out.println("return type = " +
                               m.getReturnType());
            System.out.println("-----");
         }
      }
      catch (Throwable e) {
         System.err.println(e);
      }
   }
}

