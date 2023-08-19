class continue1 
{
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		
		for(int i=1;i<=5;i++)
		{
			if(i==3)
			{
				System.out.println("continnue is executed");
				continue;
			}

		System.out.println(i);
	}
	System.out.println("main ends");
}
}
