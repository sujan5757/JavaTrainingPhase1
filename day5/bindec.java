import java.util.Scanner;
class bindec
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Binary Number: ");
		int bin=sc.nextInt();
		int x,rem=0,i=1;
		while(bin!=0)
		{
			x=bin%10;
			rem=rem+(x*(1*i));
			i*=2;;
			bin/=10;
		}
		System.out.println(rem);
	}
}