package ex04;

class Pet {
	String  name;
	void    eat() {
		System.out.println(name+"(이)가 사료를 먹는다");
	}
}

class Dog extends Pet{ // Pet + Dog
	void    bark() {
		System.out.println(name+"(이)가 멍멍");
	}
	
}
class Cat extends Pet{  // Pet + Cat
	void    meow() {
		System.out.println(name+"(이)가 냐옹");
	}
	
}

public class TestAnimalInherit {
	// 상속: INherit -> Java 에서는 extends 로 처리
	// 다중상속 불가능(상속은 한 개만 가능) -> Java, C#
	public static void main(String[] args) {
		
		Pet pet  =  new Pet();
		pet.name =  "뻐끔이";
		pet.eat();
		
		Dog dog  =  new Dog();
		dog.name =  "아지";
		dog.eat();
		dog.bark();
		
		Cat cat  =  new Cat();
		cat.name =  "레오";
		cat.eat();
		cat.meow();
	}
}
