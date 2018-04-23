package zzInterviewQandA;

/*
 * https://docs.oracle.com/javase/tutorial/java/javaOO/thiskey.html
 */ 

public class RectangleVariant {
	private int x, y;
    int width;
	 protected int height;
        
    public RectangleVariant() {
        this(0, 0, 1, 1);
    }
    public RectangleVariant(int width, int height) {
        this(0, 0, width, height);
    }
    public RectangleVariant(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    //....
        }
	public String getArea() {
		// TODO Auto-generated method stub
		return "some area figure";
	}
    
}
