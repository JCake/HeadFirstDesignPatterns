package chapter1.ducks;

import chapter1.behaviors.FlyRocketPowered;

public class MiniDuckSimulator {

	public static void main(String[] args){
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
