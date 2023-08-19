package Assement;
import java.util.Scanner;
public class cardriver1{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int  num=1;
		car c=null;
		while(num==1)
		{
			System.out.println("Enter your choice");
		System.out.println("1.Add car \n 2.fetch details\n 3.update car details\n 4.remove car\n 5.exit ");
		int choice =sc.nextInt();
		switch(choice)
		{
		case 1:
			c=new car();
			System.out.println("Enter the color and brand");
			c.carcolor=sc.next();
			c.carbrand=sc.next();
			System.out.println("enter the engine size,colorand price");
			c.e.cc=sc.nextInt();
			c.e.color=sc.next();
			c.e.price=sc.nextDouble();
			break;
		case 2:
			if(c==null)
				System.out.println("sorry first create car");
			c.cardetails();
			break;
		case 3:System.out.println("enter the updated car color and brand");
		c.carcolor=sc.next();
		c.carbrand=sc.next();
		System.out.println("enter the engine size,colorand price");
		c.e.cc=sc.nextInt();
		c.e.color=sc.next();
		c.e.price=sc.nextDouble();
		System.out.println("congratulations car re updated ");
		
		break;
		case 4:
			c=null;
			System.out.println("car has removed succefully");
			break;
		case 5:
			System.out.println("thank you for using !");

			num=0;
			break;

			
//		car obj=new car();
//		obj.carcolor="red";
//		obj.carbrand="GTR GOdzila";
//		obj.e.cc=200;
//		obj.e.color="black";
//		obj.cardetails();
	}
}
}
}