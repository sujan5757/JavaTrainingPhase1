//largest of 3 numbers using scanner 
class Big
{
	public static void main(String [] args)
	{
       int a,b,c;
	Scanner sc=new Scanner(system.in);
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
System.out.println((a>b)?(a>c): a+"a is bigger" :c+"c is bigger":(b>c)?:b+"b is bigger":c+"c is bigger");
}
}