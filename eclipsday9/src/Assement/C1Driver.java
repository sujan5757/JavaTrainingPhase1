package Assement;
import java.util.Scanner;
public class C1Driver {
	
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
System.out.println("enter the price");
double price=in.nextInt();
System.out.println("enter the brand");
String brand=in.next();
System.out.println("enter the color");
String color =in.next();

C1 obj1=new C1(price, brand, color);

obj1.details();
System.out.println("enter the price");
price=in.nextInt();
System.out.println("enter the brand");
brand=in.next();
System.out.println("enter the color");
color =in.next();

C1 obj2=new C1(price, brand, color);
obj2.details();


}

}
