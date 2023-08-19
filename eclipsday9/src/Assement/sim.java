package Assement;
import java.util.Scanner;
public class sim {
	 private int simno=120;
	 private String serviceprovider="docomo";
	 private double simbalance=20;
	 private String simcolor="black";
	 sim()
	 {
		 System.out.println("sim card details");
	 }
	 sim(int simno,String sereviceprovider,double simbalance,String simcolor)
	 {
		 this.simno=simno;
		 this.serviceprovider=serviceprovider;
		 this.simbalance=simbalance;
		 this.simcolor=simcolor;
		 
	 }
	 void simdetails()
	 {
		 System.out.println("sim no ="+simno);
		 System.out.println("serviceprovider ="+serviceprovider);
		 System.out.println("simbalance ="+simbalance);
		 System.out.println("simcolor ="+simcolor);
	 }
	 public int getsimno()
	 {
		 return simno;
		 
	 }
	 public String getserviceprovider()
	 {
		 return serviceprovider;
		 
	 }
	 public void setserviceprovider(String serviceprovider)
	 {
		 this.serviceprovider=serviceprovider;
	 }
	 public double getsimbalance ()
	 {
		 return simbalance ;
		 
	 }
	 public void setsimbalance(double simbalance)
	 {
		 this.simbalance=simbalance;
	 }
	 public String getsimcolor()
	 {
		 return simcolor;
	 }
		public static void main(String[] args) {
			 sim sc=new sim(123,"dnet",200,"blue");
			 System.out.println("sim no = "+sc.getsimno());
			 System.out.println("serviceprovider = "+sc.getserviceprovider());
			 System.out.println("simbalance = "+sc.getsimbalance());
			 System.out.println("simcolor = "+sc.getsimcolor());
			System.out.println("------------------------------------------");
			 sc.setsimbalance(4000);
			 sc.setserviceprovider("airtel");
			 sc.simdetails();
		}
	 
}
