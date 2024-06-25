package main;

public class Ex2 {

	public static void main(String[] args) {
		
//		int x = 100;
//		int y = x++;
//		int z = x--;
//		
//		System.out.println(x); // 100
//		System.out.println(y); // 100
//		System.out.println(z); // 101
		
		// 증감연산자가 변수의 앞에 있을 때
		int x = 100;
		int y = ++x;
		int z = --x;
		
		System.out.println(x); // 100
		System.out.println(y); // 101
		System.out.println(z); // 100		

	}

}
