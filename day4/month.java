//print number of days in a month
import java.util.Scanner;
class month
{
	public static void main(String [] args)
	{
	int ch;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the month number from 1 to 12");
	ch=sc.nextInt();
	switch(ch)
	{
		case 2:
		System.out.println("28 days");
		break;
		case 1,3,5,7,9,11:
		System.out.println("30days");
		break;
		case 4,6,8,10,12:
		System.out.println("31 days");
		break;
		default:
		System.out.println("invalid number");
}
}
}