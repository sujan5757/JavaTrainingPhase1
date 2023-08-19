class ABC 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		m1();
		System.out.println(m2());
		m3(true,'a');
		System.out.println(m4(7));
	}
	public static void m1()
	{
		System.out.println(m2());
		System.out.println("m1() executed");

	}
	public static String m2()
	{

		System.out.println("m2() executed with the return type string");
		return "java";
	}
	public static void m3(boolean a,char b)
	{
		System.out.println(m2());
		System.out.println("m3() executes "+a+" "+b);
	}
	public static boolean m4(int a)
	{
		System.out.println("m4() executes "+a);
		return true;
	}

}
