package day7;

public class ABCD {
	static int a=20;
	static
	{
		System.out.println("a static");
	}
	
	static
	{
		
		System.out.println(" a second sartic");
	}
	public static void main(String[] args) {
		ABC.b=30;
		System.out.println("main executes");
		
	}

}
