package chapter1.behaviors;

public class Squeak implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Squeak");
	}

}
