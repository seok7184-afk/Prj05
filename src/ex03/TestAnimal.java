package ex03;

class Dog {
	String  name;
	void    eat() {
		System.out.println(name+"(이)가 사료를 먹는다");
	}
	void    bark() {
		System.out.println(name+"(이)가 멍멍");
	}
	
}
class Cat {
	String  name;
	void    eat() {
		System.out.println(name+"(이)가 사료를 먹는다");
	}
	void    meow() {
		System.out.println(name+"(이)가 냐옹");
	}
	
}

public class TestAnimal {

	public static void main(String[] args) {
		Dog  aji  =  new Dog(); 
		// 생성자 호풀 -> 생성자가 없다 : 자바가 기본생성자를 생성해준다
		aji.name  = "아지";
		aji.eat();   
		aji.bark();   
		
		Cat  leo  =  new Cat(); 
		// 생성자 호풀 -> 생성자가 없다 : 자바가 기본생성자를 생성해준다
		leo.name  = "레오";
		leo.eat();   
		leo.meow();

	}

}
