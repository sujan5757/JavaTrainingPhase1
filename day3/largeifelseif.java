//largest of three numbers using if else if statement
import java.util.Scanner;
class largeifelseif
{
	public static void main(String [] args)
	{
	int a,b,c;
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the three numbers");
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	if((a>b)&&(a>c))
	{
		System.out.println("greater number is : "+a);
	}
	else if((b>c))
	{
		System.out.println("greater number is :"+b);
	}
	else
	{
		System.out.println("greater number is : "+c);
	}
}
}