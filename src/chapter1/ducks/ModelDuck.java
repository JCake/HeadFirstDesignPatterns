package chapter1.ducks;

import chapter1.behaviors.FlyNoWay;
import chapter1.behaviors.Quack;

public class ModelDuck extends Duck {

	//TODO should have constructor injection of behaviors?
	public ModelDuck(){
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}
	
	//TODO should this be a method in the super class?
	public void display(){
		System.out.println("I'm a model duck");
	}
}
