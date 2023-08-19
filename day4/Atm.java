//curency generator
import java.util.*;
class Atm
{
	public static void main(String [] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the amount in the mjultiple of 2000,500,100,10 : ");
	int x,v;
	int amount=sc.nextInt();
	
	if(amount>=2000)
	{
		x=amount/2000;
		v=2000*x;
		System.out.println("2000 X "+x+"--="+v);
		amount=amount-v;
		x=amount/500;
		v=500*x;
		System.out.println("500 X "+x+"--="+v);
		amount=amount-v;
		x=amount/200;
		v=200*x;
		System.out.println("200 X "+x+"--="+v);
		amount=amount-v;
			x=amount/100;
		v=100*x;
		System.out.println("100 X "+x+"--="+v);
		amount=amount-v;
		x=amount/10;
			v=10*x;
		System.out.println("10 X "+x+"--="+v);
	}
	else if(amount>=500)
	{
		x=amount/500;
		v=500*x;
		System.out.println("500 X "+x+"--="+v);
		amount=amount-v;
		x=amount/200;
		v=200*x;
		System.out.println("200 X "+x+"--="+v);
		amount=amount-v;
		x=amount/100;
		v=100*x;
		System.out.println("100 X "+x+"--="+v);
		amount=amount-v;
		x=amount/10;
		v=10*x;
		System.out.println("10 X "+x+"--="+v);
	}
	else if(amount>=200)
	{
		x=amount/200;
		v=200*x;
		System.out.println("200 X "+x+"--="+v);
		amount=amount-v;
		x=amount/100;
		v=100*x;
		System.out.println("100 X "+x+"--="+v);
		amount=amount-v;
		x=amount/10;
		v=10*x;
		System.out.println("10 X "+x+"--="+v);
	}
	else if(amount>100)
	{
		x=amount/100;
		v=100*x;
		System.out.println("100 X "+x+"--="+v);
		amount=amount-v;
		x=amount/10;
		v=10*x;
		System.out.println("10 X "+x+"--="+v);
	}
	else if(amount>10)
	{
		x=amount/10;
		v=10*x;
		System.out.println("10 X "+x+"--="+v);
	}
	else
	{
		System.out.println("no cash");
	}
}
}
	
	
	