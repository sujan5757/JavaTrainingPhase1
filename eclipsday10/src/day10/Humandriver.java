package day10;

import java.util.Scanner;


public class Humandriver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int p=1;
		Human h1= null;
		while(p==1) {
			System.out.println("----------------------------------");
			System.out.println("1.Add Human\n2.Fetch Human\n3.Update Human\n4.Remove Human\n5.Exit\nEnter your Choice: ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				h1 = new Human();
				System.out.println("Enter the Human Name,Height and Weight: ");
				h1.name = sc.next();
				h1.height = sc.nextDouble();
				h1.weight = sc.nextDouble();
				System.out.println("Enter the Heart Blood Pressure,Heart Rate and Oxygen Level: ");
				h1.h.bp = sc.nextInt();
				h1.h.rate = sc.nextInt();
				h1.h.oxygen=sc.nextInt();
				System.out.println("Congratulations!! Human Created");
				break;
			case 2:
				if (h1 == null)
					System.out.println("Sorry!! First Create a Human");
				h1.humanDetails();
				break;
			case 3:
				System.out.println("Enter the Human Name,Height and Weight: ");
				h1.name = sc.next();
				h1.height = sc.nextDouble();
				h1.weight = sc.nextDouble();
				System.out.println("Enter the Heart Blood Pressure,Heart Rate and Oxygen Level: ");
				h1.h.bp = sc.nextInt();
				h1.h.rate = sc.nextInt();
				h1.h.oxygen=sc.nextInt();
				System.out.println("Congratulations!! Human ReUpdated 😍🙌");
				break;
			case 4:
				h1 = null;
				System.out.println("Human has been Removed Successfully!!");
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
