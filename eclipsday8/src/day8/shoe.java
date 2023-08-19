package day8;

public class shoe {
	String brand;
	int price;
	String color;
	public void details() {
		System.out.println("Brand Name: "+brand);
		System.out.println("Price: "+price);
		System.out.println("Colour: "+color);
	}
	public void displaydeatails(double price,String brand,String color)
	{
		System.out.println("Brand Name: "+brand);
		System.out.println("Price: "+price);
		System.out.println("Colour: "+color);
		System.out.println("-----------------------------------------");
	}
}
