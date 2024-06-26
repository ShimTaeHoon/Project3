package quiz;

public class Quiz9 {

	public static void main(String[] args) {
		
		// 5가 3보다 크면, 문자 '오'를 출력하고, 아니면 문자 '삼'을 출력하세요
		char ch = (5 > 3) ? '오' : '삼';
		System.out.println(ch);
		
		// 다음 코드를 보고 풀이과정과 예상결과값을 주석으로 작성하세요
		int x = 10; // int형 x변수에 10을 대입한다
		int y = 20; // int형 y변수에 20을 대입한다
		int result = (x>10) ? y+10 : y-10; // 1항 조건에서 x가 10보다 크다고 했기에 false
										   // false이기에 3항이 출력 됨
										   // y는 20이기에 20-10으로 result는 10이 나옴
		System.out.println(result);
		
	}

}
