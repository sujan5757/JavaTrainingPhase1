package day10;

public class Human {
	String name;
	double height;
	double weight;
	Heart h=new Heart();
	public void humanDetails()
	{
		System.out.println("Human Name: "+name);
		System.out.println("Human Height: "+height);
		System.out.println("Human Weight: "+weight);
		h.heartdetails();
	}

}
