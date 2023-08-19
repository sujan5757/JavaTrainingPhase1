//logical operator &&=logical and operator(both are true means true)  ||=logical or  !=logical not
/*
T T T
T F F
F T F
F F F
*/
class Logical
{
	public static void main(String [] args)
	{
	int a=67;
	int b=90;
	boolean ab=(a<b && a<b)||(a!=b && a<b);//true
	System.out.println(ab);
	System.out.println(a>b && a<b);//False
	System.out.println(a!=b && a<b);//true
	System.out.println(a>b || a==b);//false
	System.out.println(a==b || a<b);//true
	System.out.println(a<b && a>=b);//false
	System.out.println(!false);

	}
}