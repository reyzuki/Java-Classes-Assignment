import java.util.Scanner;

public class Q4 {
	static class Area{
		int length;
		int breadth;
		
		public Area(int l, int b) {
			length = l;
			breadth = b;
		}	
		
	public int getArea(){
		return length * breadth;
	}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your length");
		int l = input.nextInt();
		System.out.println("Enter your breadth");
		int b = input.nextInt();
		
		Area a = new Area(l,b);
		System.out.println("The area is " + a.getArea());

	}

}
