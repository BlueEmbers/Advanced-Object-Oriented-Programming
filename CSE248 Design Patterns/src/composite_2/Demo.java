package composite_2;

public class Demo {

	public static void main(String[] args) {
//		MallardDuck mallardDuck = new MallardDuck();
		MallardDuck mallardDuck = new MallardDuck(new FlyWithWings(), new Quack());
		mallardDuck.swim();
		mallardDuck.performFly();
		mallardDuck.performQuack();
		mallardDuck.display();
//		RubberDuckie rubberDuckie = new RubberDuckie();
		RubberDuckie rubberDuckie = new RubberDuckie(new FlyNoWay(), new QuackNoWay());
		rubberDuckie.swim();
		rubberDuckie.performFly();
		rubberDuckie.performQuack();
		rubberDuckie.display();
	}

}
