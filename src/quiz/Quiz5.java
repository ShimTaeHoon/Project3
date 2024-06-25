package quiz;

public class Quiz5 {

	public static void main(String[] args) {
		
		int myAge = 33;
		int fAge = 40;
		// 1. 본인의 나이가 40세 이하라면 true를 출력하세요
		boolean age1 = (myAge <= fAge); 
		System.out.println(age1);
		// 2. 본인의 나이가 40세가 맞다면 true를 출력하세요
		boolean age2 = (myAge == fAge);
		System.out.println(age2);
		// 3. 본인의 나이가 40세가 아니라면 true를 출력하세요
		boolean age3 = (myAge != fAge);
		System.out.println(age3);
		
		// 다른방식
		boolean result = myAge <= 40;
		System.out.println(result);
		
	}

}
