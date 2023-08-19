package day8;

public class shoedriver {
	public static void main(String[] args) {
		shoe obj1=new shoe();
		shoe obj2=new shoe();
		shoe obj3=new shoe();
		obj1.brand="Puma";
		obj1.price=2000;
		obj1.color="Black";
		obj2.brand="Nike";
		obj2.price=6000;
		obj2.color="Red";
		obj3.brand="Guchi";
		obj3.price=9000;
		obj3.color="Green";
		obj1.details();
		obj1.details();
		obj1.details();
		obj1.displaydeatails(200, "paragon", "yellow");
//		System.out.println("Brand Name: "+obj1.brand);
//		System.out.println("Price: "+obj1.price);
//		System.out.println("Colour: "+obj1.color);
//		System.out.println("Brand Name: "+obj2.brand);
//		System.out.println("Price: "+obj2.price);
//		System.out.println("Colour: "+obj2.color);
//		System.out.println("Brand Name: "+obj3.brand);
//		System.out.println("Price: "+obj3.price);
//		System.out.println("Colour: "+obj3.color);
		
	}
}
