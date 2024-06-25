package quiz;

public class Quiz7 {

	public static void main(String[] args) {

		boolean result1 = (1 == 2) || (1 < 2); // 1==2는 true가 아니지만 1<2가 true이기에 결과는 true
		boolean result2 = true && false; // true와 false가 같지 않아서 false가 나옴
		boolean result3 = !false; // false값이 !로 인해 바뀌어서 true가나옴
		
		int x = 1;
		int y = 5;
		boolean result4 = (x<y) || (x==y); // ||연산자이기에 1<5가 true이므로
										   // 뒷부분은 false이지만 true가나옴

	}

}
