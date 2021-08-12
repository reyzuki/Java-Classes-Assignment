
public class Q3 {
	static class Rectangle{
		int length;
		int breadth;
		
		public Rectangle(int l, int b) {
			length = l;
			breadth = b;
		}	
		
	public int getArea(){
		return length * breadth;
	}
	
	public int getPerimeter() {
		return (2 * (length + breadth));
	}
	}
	
	

	public static void main(String[] args) {
		Rectangle a = new Rectangle(4,5);
		Rectangle b = new Rectangle(5,8);
		
		System.out.println("The area is " + a.getArea() + " and perimeter is " + a.getPerimeter());
		System.out.println("The area is " + b.getArea() + " and perimeter is " + b.getPerimeter());

	}

}
