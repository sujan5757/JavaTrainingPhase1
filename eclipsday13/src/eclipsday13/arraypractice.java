package eclipsday13;
import java.util.Scanner;
public class arraypractice {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of array size");
		int n=sc.nextInt();
		System.out.println("enter the aarre elemnet");
		String[] arr=new String[5];
//		arr[0]="hii";
//		arr[1]="hello";	
//		arr[2]="sujan";	
//		arr[3]="abhishek";	
//		arr[4]="suraj";	
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.next();
	
		}
		for(int i=n;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
}

}
