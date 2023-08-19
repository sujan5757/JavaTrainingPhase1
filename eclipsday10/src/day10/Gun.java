package day10;

public class Gun {
	private String guncolor;
	private double gunprice;
	private Bullet b;
	
public String getGuncolor() {
	return guncolor;
}

public void setGuncolor(String guncolor) {
	this.guncolor = guncolor;
}

public double getGunprice() {
	return gunprice;
}

public void setGunprice(double gunprice) {
	this.gunprice = gunprice;
}

public Bullet getB() {
	return b;
}

public void setB(Bullet b) {
	this.b = b;
}

public void gundetails()
{
	System.out.println(guncolor);
	System.out.println(gunprice);
	System.out.println(b.bulletColor);
	System.out.println(b.bulletPrice);
	System.out.println(b.bulletSize);
}
}