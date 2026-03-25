package ex06;

class Duck {
	void swim() {
		System.out.println("헤엄을 칩니다");
	}
}

// 너구리 - 코드없는 함수로 구현
// 모든 항목이 abstract 인 abstract class 는 interface 문법으로 변경 가능
// extends class -> implements 인터페이스1, 인터페이스2....
interface  Racoon {
	void dig();
}
// 오리너구리
// class DuckRacoon extends Duck, Racoon{} // 다중상속 불가능
class DuckRacoon extends Duck implements Racoon {

	@Override
	public void dig() {
		System.out.println("땅을 팝니다");
		
	}
	
}


public class TestDuckRacoon {

	public static void main(String[] args) {
		
		DuckRacoon  dr  = new DuckRacoon();
		dr.swim();
		dr.dig();
		

	}

}
