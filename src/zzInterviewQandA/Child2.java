package zzInterviewQandA;

public class Child2 extends Parent {

	private String custometType;	
	public Child2(String cType) {
		//
		//super();
		this.custometType = cType;		
	}
	/*public Child2(String n, int a, String cType) {
		super(n,a);
		//this.custometType = cType;
		//new Child2("low Class");
		//Child2(cType);
		
	}*/
	
	public Child2(String n, int a, String cType) {
		this(cType);
		this.name = n;
		this.age = a;
		//new Child2("low Class");
		//Child2(cType);
		
	}

	/* (non-Javadoc)
	 * @see zzInterviewQandA.Parent#getNameLenth()
	 */
	public String getNameLenth() {	
//		int a= name.length();
//		String s = String.valueOf(name.length());
		return String.valueOf(name.length());		 
	}
	
	
	
	@Override
	public String toString() {
		return "Child2 [custometType=" + custometType + ", name=" + name + ", age=" + age + ", type=" + type + "]";
	}
	public static void main(String[] args) {
		Child2 c2 = new Child2("Renjith", 30, "highclass");
		System.out.println("___1___>"+c2.toString());
		
		Child2 c3 = new Child2("highclass");
		System.out.println("___2___>"+c3.toString());
	}
	
}