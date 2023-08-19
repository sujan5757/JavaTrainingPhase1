package Assement;

public class pen {
	private int price=10;
	private String brand ="Reynolds";
	private String color ="yellow";
	public int getprice()
	{
		return price;
	}
	public void setprice(int price)
	{
		this.price=price;
	}
	public static void main(String[] args) {
		pen p1=new pen();
		int a=p1.getprice();
		System.out.println(a);
		p1.setprice(80);
		System.out.println(p1.getprice());
	}

}
