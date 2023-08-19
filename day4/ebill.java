import java.util.Scanner;
class ebill
{
	public static void main(String [] args)
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the nmber of units--");
	int units=sc.nextInt();
	System.out.println("enter the due amount---");
	double due=sc.nextInt();
	double amount=0;
	if(units<=50)
		{
		System.out.println("50 x 0 ="+amount);
		}
	else if(units<=100)
		{
		amount=(50*0)+((units -50)*3);
		System.out.println("50 x 0=Rs.0");
		System.out.println((units-50)+"X 3= "+amount);
		}
	else if(units<=150)
		{
		amount=(50*0)+(50*3)+((units-100)*5);
		System.out.println("50 X 0 =Rs.0");
		System.out.println("50 X 3 =Rs.150");
		System.out.println((units-100)+"X 8="+((units-100)*5));
		}
	else if(units<=200)
		{
		amount=(50*0)+(50*3)+(50*5)+((units-150)*8);
		System.out.println("50 X 0 =Rs.0");
		System.out.println("50 X 3 =Rs.150");
		System.out.println("50 X 5=Rs.200");
		System.out.println((units-150)+"X 8="+((units-150)*8));
		}
	else
		{
		System.out.println("Total amoount : Rs . "+amount);
		}
	
	if(due==0)
		{
			double discount=amount*0.05;
			amount=amount-discount;
			System.out.println("Net amount : Rs."+amount);
		}
	else
		{
		double penalty =due*0.1;
		System.out.println("penalty because of due :"+penalty);
		amount=amount+penalty+due;
		}
	}
}


