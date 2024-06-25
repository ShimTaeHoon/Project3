package main;

public class Ex5 {

	public static void main(String[] args) {

		int x = 5;
		int y = 10;
		
		boolean result1 = (x > y);
		System.out.println("x가 y보다 큰가요?" + result1); // f
		boolean result2 = (x >= y);
		System.out.println("x가 y보다 크거나 같은가요?" + result2); // f
		boolean result3 = (x < y);
		System.out.println("x가 y보다 작은가요?" + result3); // t
		boolean result4 = (x <= y);
		System.out.println("x가 y보다 작거나 같은가요?" + result4); // t
		boolean result5 = (x == y);
		System.out.println("x와 y의 값이 같은가요?" + result5); // f
		boolean result6 = (x != y);
		System.out.println("x와 y의 값이 다른가요?" + result6); // t

	}

}
