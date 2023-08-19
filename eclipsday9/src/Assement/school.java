package Assement;

public class school {
	 private String principal ="abhishek";
	 private int nostaff=50;
	 private int nostudent=200;
	 private String schoolname="Alv's";
	school()
	 {
		 System.out.println("school details");
	 }
	 school(String principal,int nostaff,int nostudent,String schoolname)
	 {
		 this.principal=principal;
		 this.nostaff=nostaff;
		 this.nostudent=nostudent;
		 this.schoolname=schoolname;
		 
	 }
	 void schooldetails()
	 {
		 System.out.println("principal name ="+principal);
		 System.out.println("no staff ="+nostaff);
		 System.out.println("nostudent ="+nostudent);
		 System.out.println("schoolname ="+schoolname);
	 }
	 public String getprincipal()
	 {
		 return principal;
		 
	 }
	
	 public int getnostaff()
	 {
		 return nostaff;
		 
	 }
	 public void setnostaff(int nostaff)
	 {
		 this.nostaff=nostaff;
	 }
	 public int getnostudent()
	 {
		 return nostudent;
	 }
	 public void setnostudent(int nostudent)
	 {
		 this.nostudent=nostudent;
	 }
	
	 public String getschoolname ()
	 {
		 return schoolname ;
		 
	 }
	
	
		public static void main(String[] args) {
			 school sc=new school("sujan",290,7000,"Sujan institute of enginering and technology");
			 System.out.println("principal name = "+sc.getprincipal());
			 System.out.println("nostaff = "+sc.getnostaff());
			 System.out.println("nostudent = "+sc.getnostudent());
			 System.out.println("schoolname= "+sc.getschoolname());
			System.out.println("------------------------------------------");
			 sc.setnostudent(67809);
			 sc.setnostaff(567);
			 sc.schooldetails();
			 System.out.println("->->->->->->->->->->->");
			 school ne=new school("prasad",290,7000,"PES");
			 ne.schooldetails();
		}
	 
}
