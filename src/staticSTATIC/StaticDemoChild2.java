package staticSTATIC;

/**
 * @author Renjith
 *
 */
public class StaticDemoChild2 extends StaticDemo2{
    static{
        System.out.println("static block of child class");
    }
    public void display()
    {
        System.out.println("Just a method of child class");
    }
    public static void main(String args[])
    {
        StaticDemoChild obj = new StaticDemoChild();
        obj.display();
    }
}
