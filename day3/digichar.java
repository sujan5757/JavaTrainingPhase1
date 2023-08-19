//finding the given value is character or number
import java.util.Scanner;
class digichar{
public static void main(String []args)
{
Scanner sc= new Scanner(System.in);
System.out.println("enter a character or digit");
char t=sc.next().charAt(0);
if(t>='a'&& t<='z'||t>='A'&& t<='Z')
{
System.out.println(t+"is an alphabet");
}
else if(t>='0'&& t<='9')
{
System.out.println(t+"is an digit");
}}}