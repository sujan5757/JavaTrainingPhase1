package day10;

public class Mobile {
	String name;
	String processor;
	int price;
	Battery b=new Battery();
	public void mobiledetails() {
		System.out.println("Mobile Brand: "+name);
		System.out.println("Mobile Processor: "+processor);
		System.out.println("Mobile Price: "+price);
		b.batterydetails();
	}
	
	

}

