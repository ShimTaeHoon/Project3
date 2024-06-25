package quiz;

public class Quiz2 {

	public static void main(String[] args) {
		
		//코드를 보고, x y result의 값을 예상해서 주석으로 작성하세요
		int x = 10; // result에서 ++를 해주어서 11이 됨
		System.out.println(x);
		int y = 20; // result에서 --를 해주어서 19가 됨
		System.out.println(y);
		int result = (x++) + (--y); // x에 10을 넣고 ++연산자로 1을 증가시켜 x의 값이 11이 되고
									// --연산자로 1을 감소시켜 y의 값이 19가 됨
									// result = (x : 10) + (y : 19) = 29
									// x++이기에 x는 다음 라인에서 1추가 되는것
		System.out.println(x);
		System.out.println(y);
		System.out.println(result);
		
	}

}
