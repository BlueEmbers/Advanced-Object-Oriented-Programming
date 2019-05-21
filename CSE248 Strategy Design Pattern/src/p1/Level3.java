package p1;

public class Level3 implements Ability
{
	@Override
	public void travel()
	{
		System.out.println("Level3: Travel in car");
	}

	@Override
	public void handleWeapons() 
	{
		System.out.println("Level3: Fight with pistol");
		
	}

	@Override
	public void protect() 
	{
		System.out.println("Level3: Wear armor");
		
	}
	

//	public void act()
//	{
//		travel();
//		handleWeapons();
//		protect();
//	}

}

