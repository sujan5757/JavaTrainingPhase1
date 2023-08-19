//finding the ovels in the alphbet using the if else if statement
import java.util.Scanner;
class alpha
{
public static void main(String [] args)
{
Scanner sc =new Scanner(System.in);
System.out.println("enter the character");
char p=sc.next().charAt(0);
if(p=='a'||p=='e'||p=='i'||p=='o'||p=='u')
{
System.out.println(p+"-----is owel");
}
else
{
System.out.println(p+"----is consonents");
}
}
}

