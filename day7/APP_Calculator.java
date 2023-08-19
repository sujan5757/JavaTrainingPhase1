import java.util.Scanner;
class APP_Calculator
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int p=1,choice,a,b;
		char s;
		do{
			System.out.println("\n!-----Calculator Application-----!");
			System.out.println("\n1.Addition\n2.Subtraction\n3.Multiplpication\n4.Division\n5.Exit\nEnter Your Choice: ");
			choice=sc.nextInt();
			
			switch(choice)
			{
				case 1: System.out.print("Enter the Numbers: ");
						a=sc.nextInt();
						b=sc.nextInt();
						System.out.println("The Sum of 2 Numbers is: "+calculatorapp.add(a,b));
						break;
				case 2: System.out.print("Enter the Numbers: ");
						a=sc.nextInt();
						b=sc.nextInt();
						System.out.println("The Substraction of 2 Numbers is: "+calculatorapp.sub(a,b));
						break;
				case 3: System.out.print("Enter the Numbers: ");
						a=sc.nextInt();
						b=sc.nextInt();
						System.out.println("The Multiplication of 2 Numbers is: "+calculatorapp.mul(a,b));
						break;
				case 4: System.out.print("Enter the Numbers: ");
						a=sc.nextInt();
						b=sc.nextInt();
						System.out.println("The Division of 2 Numbers is: "+calculatorapp.div(a,b));
						break;
				case 5: System.out.println("Do u want to Exit (Y/N): ");
						s=sc.next().charAt(0);
						if(s=='y' || s=='Y')
						{	
							System.out.println("Thank you for using our Calculator App :)");
							p=0;
							break;
						}
						else if(s=='n' || s=='N')
						{
							System.out.println("Continuing the Application");
							break;
						}
			}
		}while(p==1);


	}
}
