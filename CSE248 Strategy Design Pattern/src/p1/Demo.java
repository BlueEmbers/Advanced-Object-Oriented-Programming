package p1;

public class Demo {

	public static void main(String[] args) 
	{
		Hero hero = new Hero();
		hero.setAbility(new Level1());
		hero.act();
		
		System.out.println();
		
		Hero hero2 = new Hero();
		hero2.setAbility(new Level2());
		hero2.act();
		
		System.out.println();
		
		Hero hero3 = new Hero();
		hero3.setAbility(new Level3());
		hero3.act();

	}

}
