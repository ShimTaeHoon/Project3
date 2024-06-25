package quiz;

public class Quiz4 {

	public static void main(String[] args) {

		// 수학, 영어, 국어의 점수가 각각 90, 70, 100일 때
		int mathScore = 90;
		int engScore = 70;
		int korScore = 100;
		// 이 과목들의 총점과 평균을 구하세요
		int totalScore = mathScore + engScore + korScore;
		System.out.println("과목총점 : " + totalScore);
		double avgScore = totalScore / 3.0;
		System.out.println("과목평균 : " + avgScore);
	
	}

}
