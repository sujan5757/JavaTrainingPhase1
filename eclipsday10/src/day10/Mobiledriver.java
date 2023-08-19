package day10;
import java.util.Scanner;

public class Mobiledriver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int p=1;
		Mobile m= null;
		while(p==1) {
			System.out.println("----------------------------------");
			System.out.println("1.Add Mobile\n2.Fetch Mobile\n3.Update Mobile\n4.Remove Mobile\n5.Exit\nEnter your Choice: ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				m= new Mobile();
				System.out.println("Enter the Mobile Brand,Processor and Price: ");
				m.name = sc.next();
				m.processor = sc.next();
				m.price= sc.nextInt();
				System.out.println("Enter the Battery Capacity and Size: ");
				m.b.capacity=sc.nextInt();
				m.b.length=sc.next();
				System.out.println("Congratulations!! Mobile Created");
				break;
			case 2:
				if (m == null)
					System.out.println("Sorry!! First Create a Mobile");
				m.mobiledetails();
				break;
			case 3:
				System.out.println("Enter the Mobile Brand,Processor and Price: ");
				m.name = sc.next();
				m.processor = sc.next();
				m.price= sc.nextInt();
				System.out.println("Enter the Battery Capacity and Size: ");
				m.b.capacity=sc.nextInt();
				m.b.length=sc.next();
				System.out.println("Congratulations!! Mobile ReUpdated 😍🙌");
				break;
			case 4:
				m = null;
				System.out.println("Mobile has been Removed Successfully!!");
				break;
			case 5:
				System.out.println("Thank You for Using!!");
				p = 0;
				break;

			}
		}
		sc.close();
		
	}

}