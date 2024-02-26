package javapackage;

public class Swapping {

	public static void main(String[] args) {
		int a=10, b=15;
		a = a + b; //25
		b = a-b ;
		a=a-b;
	
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		
		
		int x = 80, y = 20;
		x = x/y;   //4
		y = x*y;  //80
		x = y/x;
		
		System.out.println("x = " + x);
		System.out.println("Y = " + y);
	}

}
