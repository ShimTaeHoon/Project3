package quiz;

public class Quiz6 {

	public static void main(String[] args) {

		// 1. 7이 홀수가 맞는지 확인하고, 결과를 출력하세요
		int seven = 7;
		int holl = seven % 3;
		boolean result3 = holl == 1;
		System.out.println("test : " + result3);
		
		int hol = seven % 2;
		boolean result = (hol == 1);
		System.out.println(result);
		// 2. 10이 짝수가 맞는지 확ㅇ니하고, 결과를 출력하세요
		int ten = 10;
		int jjak = ten % 2;
		boolean result2 = (jjak == 0);
		System.out.println(result2);
	
		int tenten = 10;
		int bigyo = tenten % 2;
		boolean result123 = bigyo == 0;
		System.out.println(result123);
		
	}

}
