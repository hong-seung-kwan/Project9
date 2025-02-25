package abstractex;

public class Ex1 {

	public static void main(String[] args) {
		// 컴퓨터 인스턴스 생성
		// 추상클래스는 완전한 클래스가 아니므로 인스턴스를 생성할 수 없다
		// Computer computer = new Computer();

		// 자식 클래스로 인스턴스 생성
		DeskTop deskTop = new DeskTop();
		NoteBook noteBook = new NoteBook();

		deskTop.turnOn();
		deskTop.turnOff();
		deskTop.display();
		deskTop.typing();

		noteBook.turnOn();
		noteBook.turnOff();
		noteBook.display();
		noteBook.typing();

	}
}

// 추상클래스
// 추상메소드를 하나이상 가지고 있는 클래스
// 일반함수,추상함수 모두 가질 수 있음
abstract class Computer {
	// 공통 기능
	public void turnOn() {
		System.out.println("전원을 켭니다");
	}

	public void turnOff() {
		System.out.println("전원을 끕니다");
	}

	// 고유 기능
	// 컴퓨터의 종류마다 화면을 표시하는 방법과 타이핑하는 방법이 다름
	public abstract void display();
	public abstract void typing();
}

class DeskTop extends Computer {

	@Override
	public void display() {
		System.out.println("DeskTop display..");

	}

	@Override
	public void typing() {
		System.out.println("DeskTop typing..");

	}

}

class NoteBook extends Computer {

	@Override
	public void display() {
		System.out.println("NoteBook display..");
	}

	@Override
	public void typing() {
		System.out.println("NoteBook typing..");
	}

}