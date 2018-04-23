package zzInterviewQandA_Reflection;

/**
 * @author Renjith
 *
 */


public class instance1 {
   public static void main(String args[])
   {
      try {
         Class cls = Class.forName("zzInterviewQandA_Reflection.A");//full name of class A
         boolean b1 
           = cls.isInstance(new Integer(37));
         System.out.println(b1);
         boolean b2 = cls.isInstance(new A());
         System.out.println(b2);
         
         //
         A a = new A();
         boolean b3 = cls.isInstance(a);
         System.out.println(b3);
         
         
      }
      catch (Throwable e) {
         System.err.println(e);
      }
   }
}