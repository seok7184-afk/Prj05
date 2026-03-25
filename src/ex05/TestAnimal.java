package ex05;

abstract class Pet { // 한 개 이상의 abstract 메소드가 있다면 abstract class
	String name;
	void eat() {
		System.out.println(name + "가 먹는다");
	}
	abstract void sound(); // 함수에 {}가 없으면 abstract 필수
}
class Dog extends Pet {
	// 코딩이 없는 함수를 상속받으면 반드시 자식이 코딩을 구현해야한다 - 재정의
	// Add Unimplemented method
	@Override
	void sound() {
		System.out.println(name + "가 멍멍");
	}
}
class Cat extends Pet {
	@Override
	void sound() {
		System.out.println(name + "가 냐옹");
		
	}
}

public class TestAnimal {

	public static void main(String[] args) {
		
		// Pet pet  = new pet(); // abstracts 가 있으면 new 불가능
		
		Dog dog1 = new Dog();
		work(dog1, "아지");
//		dog.name = "아지";
//		dog.eat();
//		dog.sound();
		
		Cat cat1 = new Cat();
		work(cat1, "레오");
//		cat.name = "레오";
//		cat.eat();
//		cat.sound();

	}
	// 방법2
	// work 한 개로 통일
	// 부모클래스는 자식객체를 담을 수 있다 Pet pet = new Dog();
	// 자식클래스는 부모타입을 담을 수 없다 Pet pet = Dog dog = (Dog) pet;
	private static void work(Pet pet, String name) {
		pet.name = name;
		pet.eat();
		pet.sound();
		
	}
	
	
	//-----------------------------------------------------------
	// 방법1 : 함수의 오버로드 기능 활용
	/*
	private static void work(Cat cat1, String name) {
		cat1.name = name;
		cat1.eat();
		cat1.sound();
		
	}

	private static void work(Dog dog1, String name) {
		dog1.name = name;
		dog1.eat();
		dog1.sound();
		
	}
	*/



}
