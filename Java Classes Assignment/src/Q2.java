
public class Q2 {
	static class Triangle{
		int a, b, c;
		public double getArea(){
			double s = (a + b + c) / 2.0;
			return Math.sqrt(s*(s-a)*(s-b)*(s-c));
		}
		public double getPerimeter() {
			return (a + b + c);
		}
	}

	public static void main(String[] args) {
		Triangle t = new Triangle();
		t.a = 3;
		t.b = 4;
		t.c = 5;
		
		System.out.println("The perimeter is " + t.getPerimeter());
		System.out.println("The area is " + t.getArea());

	}

}
