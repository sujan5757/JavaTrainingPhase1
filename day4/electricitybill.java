//elelctricity bill generator using java  
import java.util.*;  
class electricitybill 
{   
    public static void main(String  args[])   
    {      
        int u;  
        double  pay=0;    
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter number of units :------");  
        u=sc.nextInt();  
        if(u < 100)  
        {  
            pay=u*1.20;  
        }  
        else if(u< 300){  
        pay=100*1.20+(u-100)*2;  
        }  
        else if(u>300)  
        {  
        pay =100*1.20+200*2+(u-300)*3;  
        }  
        System.out.println("The electricity bill for " +u+ " is :----- " +pay);   
    }   
}  