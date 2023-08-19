/*largest of 2 numbers using if else statement */
import java.util.Scanner;
class largeifelse
{
	public static void main(String [] args)
	{
	int a,b;
	Scanner sc =new Scanner(System.in);
      System.out.println("enter the three  numbers");
	a=sc.nextInt();
	b=sc.nextInt();
		if(a>b)
		{
		System.out.println(" greater number is : "+a);
		}
		else
		{
		System.out.println("greater number is  : "+b);
		}
	}
}

