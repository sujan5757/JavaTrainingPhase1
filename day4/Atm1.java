import java.util.Scanner;
class Atm1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Amount in the Multiples of 2000,500,100: ");
		int amount=sc.nextInt();
		int x,flag=0;
		if(amount>=2000)
		{
			x=amount/2000;
			System.out.println("2000 X "+x+" = "+2000*x);
			amount%=2000;
			flag=1;
		}
		if(amount>=500)
		{
			x=amount/500;
			System.out.println("500 X "+x+" = "+500*x);
			amount%=500;
			flag=1;
		}
		if(amount>=100)
		{
			x=amount/100;
			System.out.println("100 X "+x+" = "+100*x);
			amount%=100;
			flag=1;

		}
		if(flag==0)
		{
			System.out.println("No cash");
		}
		
	}
}