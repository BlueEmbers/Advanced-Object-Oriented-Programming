package p1;

public class RobotFacade 
{
	private RobotColor rc;
	private RobotMetal rm;
	private RobotBody rb;
	
	public RobotFacade()
	{
		rc = new RobotColor();
		rm = new RobotMetal();
		rb = new RobotBody();
	}
	
	public void constructRobot(String color, String metal)
	{
		System.out.println("Creation starting...");
		rc.setColor(color);
		rm.setMetal(metal);
		rb.createBody();
		System.out.println("Creation completed!");
		System.out.println();
	}

}
