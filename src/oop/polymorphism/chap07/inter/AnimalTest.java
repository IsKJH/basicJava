package oop.polymorphism.chap07.inter;

public class AnimalTest {
	public static void main(String[] args) {
		Animal dog = new Dog(8);
		Animal chicken = new Chicken(3);
		Chicken cheatableChicken = new Chicken(5);

		for (int i = 1; i <= 3; i++) {
			System.out.println(i + "시간 후");
			System.out.print("개의 이동거리=");
			dog.run(i);
			System.out.print("닭의 이동거리=");
			chicken.run(i);
			System.out.print("날으는 닭의 이동거리=");
			if (cheatableChicken instanceof Chicken) {
				cheatableChicken.fly();
			}
		}
	}
}
