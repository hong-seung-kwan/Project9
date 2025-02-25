package abstractex;

public class Ex2 {

	public static void main(String[] args) {

		Animal cat = new Cat();
		cat.breathe();
		cat.sound();

		Animal dog = new Dog();
		dog.breathe();
		dog.sound();

		// 자식들의 고유한 기능을 왜 부모에 넣을까?
		// 형변환과 다형성을 사용하기 위해서!
	}

}

abstract class Animal {
	public void breathe() {
		System.out.println("동물이 숨을 쉽니다");
	}

	// 동물마다 내는 소리가 다르기 때문에 추상메소드로 선언
	// 실제 소리는 자식클래스에서 정의할 것
	public abstract void sound();
}

class Cat extends Animal {

	@Override
	public void sound() {
		System.out.println("야옹~");
	}
}

class Dog extends Animal {

	@Override
	public void sound() {
		System.out.println("멍멍~");
	}

}