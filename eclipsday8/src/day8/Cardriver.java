package day8;
public class Cardriver

 {
	public static void main(String[] args) {
		Car obj1=new Car();
		Car obj2=new Car();
		Car obj3=new Car();
		obj1.brand="Mustang";
		obj1.price=4500000;
		obj1.color="Black";
		obj2.brand="BMW";
		obj2.price=6000000;
		obj2.color="Red";
		obj3.brand="Sujan";
		obj3.price=9000000;
		obj3.color="Green";
		obj1.details();
		obj1.details();
		obj1.details();
		obj1.displaydeatails(200, "sujanpro", "whitishred");
		
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

 