package day8;

public class Mobiledriver {

	public static void main(String[] args) {
		Mobile obj1=new Mobile();
		Mobile obj2=new Mobile();
		Mobile obj3=new Mobile();
		obj1.brand="MI";
		obj1.price=12000;
		obj1.color="Black";
		obj2.brand="Realme";
		obj2.price=6000;
		obj2.color="Red";
		obj3.brand="Apple";
		obj3.price=90000;
		obj3.color="Purple";
		obj1.details();
		obj1.details();
		obj1.details();
		obj1.displaydeatails(2000, "samsung", "white");
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
