package day10;

public class Gundriver {
	public static void main(String[] args) {
		System.out.println("main starts");
		Gun g1=new Gun();
		g1.setguncolor("black");
		g1.setgunprice(2345);
		g1.setB(new Bullet());
		g1.getB().bulletColor="yellow";
		g1.getB().bulletPrice=567;
		g1.getB().bulletSize=12;
		g1.gundetails();
		System.out.println("main ends");
	}

}
