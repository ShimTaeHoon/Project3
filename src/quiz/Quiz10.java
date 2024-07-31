package quiz;

public class Quiz10 {

	public static void main(String[] args) {
		
		int result1 = -5 + 3 * 10 / 2;
		// 연산자 우선순위에 따라 곱하기와 나누기 먼저 진행
		// 3 * 10 = 30 > 30 / 2 = 15 > -5 + 15 = 10
		System.out.println(result1);
		
		int x = 1; // int형 변수 x에 1을 대입
		int result = (++x) + 5; // ++연산자로 인해 x에 1이 먼저 추가되어 x = 2
								// 2+5 = 7이 나옴
		int result2 = (x++) + 5;
		System.out.println(result);
		System.out.println(result2);

	}

}
