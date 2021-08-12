import java.util.Scanner;

public class Q5 {
	static class Complex{
		int real, imag;
		
		public Complex(int r, int i) {
			real = r;
			imag = i;
		}
		
		public static Complex add(Complex a, Complex b) {
			return new Complex ((a.real + b.real),(a.imag + b.imag));
		}
		
		public static Complex sub(Complex a, Complex b) {
			return new Complex ((a.real - b.real),(a.imag - b.imag));
		}
		
		public static Complex pro(Complex a, Complex b) {
			return new Complex (((a.real * b.real)-(a.imag * b.imag)),((a.real * b.imag)+(a.imag *b.real)));
		}
		
		public void printComplex() {
			if (real == 0 && imag != 0) {
				System.out.println(imag + "i");
			}
			else if (imag == 0 && real != 0) {
				System.out.println(real);
			}
			else {
				System.out.println(real + "+" + imag + "i");
			}
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first real number");
		int x = input.nextInt();
		System.out.println("Enter first imaginary number");
		int y = input.nextInt();
		
		System.out.println("Enter Second real number");
		int z = input.nextInt();
		System.out.println("Enter Second imaginary number");
		int w = input.nextInt();
		
		
		
		Complex c = new Complex (x,y);
		Complex d = new Complex (z,w);
		
		Complex e = Complex.add(c, d);
		Complex f = Complex.sub(c, d);
		Complex g = Complex.pro(c, d);
		
		e.printComplex();
		f.printComplex();
		g.printComplex();

	}

}
