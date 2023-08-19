import java.util.Scanner;
class Calculator{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 Numbers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modulo\nEnter your Choice: ");
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1: System.out.println("The Addition of "+a+" and "+b+" is: "+(a+b));
					break;
			case 2: System.out.println("The Substraction of "+a+ " and "+b+" is" +(a-b));
					break;
			case 3: System.out.println("The Multiplication of "+a+" and "+b+" is: "+(a*b));
					break;
			case 4: System.out.println("The Division of "+a+" and "+b+" is: "+(a/b));
					break;
			case 5: System.out.println("The Modulo of "+a+" and "+b+" is: "+(a%b));
					break;
			default: System.out.println("No Operation Possible");
					break;
		}
	}
}