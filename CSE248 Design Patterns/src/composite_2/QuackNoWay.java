package composite_2;

public class QuackNoWay implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("No Quack.");
	}

}
