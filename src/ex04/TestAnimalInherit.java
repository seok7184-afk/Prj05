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
	
class Tiger extends Pet{  // Pet + Tiger
	void    cry() {
		System.out.println(name+"(이)가 어흥");
	}
	
}

public class TestAnimalInherit {
	// 상속: INherit -> Java 에서는 extends 로 처리
	// 다중상속 불가능(상속은 한 개만 가능) -> Java, C#
	public static void main(String[] args) {
		Dog dog  =  new Dog();
		work(dog, "아지");
		// dog.name =  "아지";
		// dog.eat();
		// dog.bark();
		
		Cat cat  =  new Cat();
		work(cat, "레오");
		// cat.name =  "레오";
		// cat.eat();
		// cat.meow();
		
		Tiger tiger = new Tiger();
		work(tiger, "큰냥이");
		System.out.println("===========================");
		
		Pet pet  =  new Pet();
		pet.name =  "뻐끔이";
		pet.eat();
		
	}
	// 한 개의 work() 함수로 업무처리
	private static void work(Pet pet, String name) {
		pet.name = name;
		System.out.println("work:");
		pet.eat();
		
		if(pet instanceof Dog)
			((Dog) pet).bark();
		if(pet instanceof Cat)
			((Cat) pet).meow();
		if(pet instanceof Tiger)
			((Tiger) pet).cry();
		
	}
	/*
	private static void work(Cat cat, String name) {
		cat.name =  name;
		System.out.println("work: ");
		cat.eat();
		cat.meow();
		
	}

	private static void work(Dog dog, String name) {
		dog.name = name;
		System.out.println("work: ");
		dog.eat();
		dog.bark();
		
	}
	*/
}
