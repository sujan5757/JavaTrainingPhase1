import java.util.*;
class count1{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Eneter the number :");
int count=0;
int n=sc.nextInt();
while(n!=0)
{
n=n/10;
count++;
}
System.out.println("Total  numbers are :  "+count);
}
}
	
