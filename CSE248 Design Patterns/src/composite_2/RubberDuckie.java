package composite_2;

public class RubberDuckie extends Duck {
	
	public RubberDuckie() {
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new QuackSqueak());
	}
	
	public RubberDuckie(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
		setFlyBehavior(flyBehavior);
		setQuackBehavior(quackBehavior);
	}
	
	@Override
	public void display() {
		System.out.println("Showing rubber duckie ...");
	}

}
