package abstractex;

import java.util.ArrayList;

public class Quiz5 {

	public static void main(String[] args) {
		ArrayList<Animal2> list = new ArrayList<Animal2>();
		list.add(new Human());
		list.add(new Tiger());
		
		for(Animal2 animal2:list) {
			animal2.sleep();
			if(animal2 instanceof Human) {
				Human human = (Human)animal2;
				human.move();
				human.readBook();
				System.out.println();
			} else if(animal2 instanceof Tiger) {
				Tiger tiger = (Tiger)animal2;
				tiger.move();
				tiger.hunting();
			}
		}

	}

}
