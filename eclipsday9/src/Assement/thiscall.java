package Assement;

import java.util.Scanner;

public class thiscall {
	String brand="sujan";
	double price=1890;
	String color="blue";
	thiscall()
	{
		System.out.println("hii");
		
	}
	thiscall(String brand,String color)
	{
		this();
		this.brand=brand;
		this.color=color;
		
	}
	thiscall(double price,String brand,String color )
	{
		this(brand,color);
		this.price=price;
	}
	public void details()
	{
		System.out.println("price : Rs."+price); 
		System.out.println("brand :"+brand); 
		System.out.println("color :."+color); 
		
	}
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		thiscall obj=new thiscall(6785,"sujanps","purple");
		obj.details();
		sc.close();
		
				
	}

}
