package Assement;

public class C1 {
double price;
String brand;
String color;

C1(double price,String brand,String color)
{
this.price=price;
this.brand=brand;
this.color=color;

}
public void details()
{
System.out.println("price:Rs."+price);
System.out.println("brand:"+brand);
System.out.println("color:"+color);
System.out.println("----------------------");
}

}
