/* CONDITIOINAL OPERATOR op1 ? op2: op3
a>b ?a:b
*/
class Conditional
{
	public static void main(String [] args)
	{
//case1 start
	int a=10;
	int b=20;
	int c=(a>b) ?a:b;
	System.out.println(c);
	System.out.println((a>b) ?a:b);
//case1 end
//case2 start for smallest and largest number
	int A=40;
	int B=100;
	int C=(A<B)?A:B;
	//SMALLEST NUMBER 
	System.out.println((A<B)?A:B);
	//LARGEST NUMBER
	System.out.println((A>B)?A:B);
//case 2 end 
// case 3 finding even and odd numbers
	int num =100;
	//finding even numbers using coditional operator 
	String t = (num%2 ==0)?"even" :"odd";
	System.out.println(t);
	//finding the odd numbers using conditionla operator
	int od=45;
	String f = (od%2==0)? "even":"odd";
	System.out.println(f);
// case 3 ends
// case 4 finding the greatest of three numbers using the conditional operator
      int k=4;
      int l=9;
      int m=56;
      int g = (k>l)?(k>m ? k :l) :(l>m ? l:m);
	System.out.println(g);//56
	System.out.println((k>l)?(k>m ? k :l) :(l>m ? l:m));
//case4 end 
// case 5 finding the largest of two  numbers 
      int o=67;
      int n=78;
      int h =(o>n)?o:n;
	System.out.println(h);//78
      
	}
}