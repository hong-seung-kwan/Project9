package abstractex;

import java.util.ArrayList;

public class Quiz4 {

	public static void main(String[] args) {
		
		// 타입: Bus, AutoCar의 부모
		ArrayList<Car2> list = new ArrayList<Car2>();

		list.add(new Bus());
		list.add(new AutoCar());

		for (Car2 car : list) {
			car.run();
			car.refuel();

			if (car instanceof Bus) {
				Bus bus = (Bus) car;
				bus.takePassenger();
				System.out.println();
			} else if (car instanceof AutoCar) {
				AutoCar autocar = (AutoCar) car;
				autocar.load();
			}
		}

	}

}