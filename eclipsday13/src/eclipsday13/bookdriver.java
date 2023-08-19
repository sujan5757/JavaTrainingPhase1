package eclipsday13;
import java.util.Scanner;
public class bookdriver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number of objects");
		int obj=sc.nextInt();
		book b;
		book[] a=new book[obj];
		for(int i=0;i<obj;i++)
		{
			System.out.println("enter the book name ,author & price");
			String bookname=sc.next();
			String bookauthor=sc.next();
			int price=sc.nextInt();
			a[i]=new book(bookname,bookauthor,price);
		}
	//without user input	
//		book b1=new book("SPIDER","SUJAN P S",56743);
//		 book b2=new book("the pirate of the carabian","sujan p s",7876544);
//		 book b[]=new book[2];
//		 b[0]=b1;
//		 
//		 b[1]=b2;
		 for (int i = 0; i < a.length; i++) {
			 System.out.println("book name is :"+a[i].bookname);
			 System.out.println("book author is :"+a[i].bookauthor);
			 System.out.println("book price is :"+a[i].price);
			 System.out.println("--------------------------------------------");
			
		}
	}

}
