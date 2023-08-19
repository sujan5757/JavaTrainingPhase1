package Assement;

public class car{
	String carcolor;
	String carbrand;
	Engine e =new Engine();
	public void cardetails()
	{
		System.out.println("carcolor "+carcolor);
		System.out.println("car brand "+carbrand);
		e.enginedetails();
	}
	
}
