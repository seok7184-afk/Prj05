package ex08;

public class TestException {

	public static void main(String[] args) {
		
		/*
		int n1 = 7;
		// int n2 = 2;
		int n2 = 0;
		int n = n1 / n2; // 정수 / 정수 -> 정수 3
		// Exception in thread "main" java.lang.ArithmeticException: / by zero
		// at ex08.TestException.main(TestException.java:10) 10에서 프로그램 강제종료, 이후 코드 실행 안함
		System.out.println(n);
		System.out.println("프로그램 종료");
		*/
		
		// 예외처리(Exception Handling)
		// 예외 - 실행 중에 발생하는 오류
		try {
			int n1 = 7;
			int n2 = 0;
			int n = n1 / n2;
		} catch(Exception e) { // 오류 발생시 처리방법
			System.out.println("오류발생" + e);
		} finally { // 오류에 상관없이 무조건 실행되는 문장
			System.out.println("프로그램 종료");
		}

	}

}
