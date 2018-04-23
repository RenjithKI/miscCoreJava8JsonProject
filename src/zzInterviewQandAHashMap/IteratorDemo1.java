package zzInterviewQandAHashMap;

/**
 * @author Renjith
 *
 */
import java.util.ArrayList;
import java.util.Iterator;
 
public class IteratorDemo1 {
 
  public static void main(String args[]){
    ArrayList<String> names = new ArrayList<>();
    names.add("Chaitanya");
    names.add("Steve");
    names.add("Jack");
    
   
 
    Iterator it = names.iterator();
 
    while(it.hasNext()) {
      String obj = (String)it.next();
      System.out.println(obj);
    }
    
    System.out.println("_______________JAVA 8____________________");
    for (String name : names) {
        System.out.println(name);
    }
    
    System.out.println("_______________JAVA 8____________________");
 /*   for (String item : someList) {
        System.out.println(item);
    }*/
    
    
  }
 
}