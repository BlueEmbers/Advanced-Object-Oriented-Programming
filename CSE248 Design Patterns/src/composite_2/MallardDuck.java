package composite_2;

public class MallardDuck extends Duck {
	
	public MallardDuck() {
		setFlyBehavior(new FlyWithWings());
		setQuackBehavior(new Quack());
	}
	
	public MallardDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
		setFlyBehavior(flyBehavior);
		setQuackBehavior(quackBehavior);
	}

	@Override
	public void display() {
		System.out.println("Showing mallard duck...");
	}

}
