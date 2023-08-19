/* increment or dcrement operATOR
pre incremnet 
first increment -->1
later use it 
++a 
ex------
int b=3;
sop(++b);//4
sop(b);//4

post incremnet
first use it 
then icrement by -->1
a++
example---------
int b=2;
sop(b++);//2
sop(b);//3
*/
class IncDec
{
	public static void main(String [] args)
	{
//one part of program start
	int a=2;
	++a;
	System.out.println(a);//3
	System.out.println(a++);//3
	System.out.println(a);//4
	System.out.println(++a);//5
//one part of program end
//second start	
	int b=3;
	System.out.println(b++);//3
	System.out.println(b);//4
//second end
//third start
	int c=4;
	System.out.println(++c);//5
	System.out.println(c);//5
//third end
//four start
	int d=2;
	d=d++ + ++d;
	System.out.println(d);//6
	System.out.println(d++);//6
	System.out.println(d);//7
	System.out.println(++d);//8
//four end
//five start
	int e=2;
	int f=3;
	e+= ++e + f++ + --f + ++f;
	f-=f++ + --f + e-- +f;
	System.out.println(f++);//-23
	System.out.println(--e);//13
	System.out.println(e--);//1                                                                                                                                                                                                                                   3
	System.out.println(f--);//-22
	System.out.println(f);//-23
	System.out.println(e);//12
//five  end
//six start
	int p=2;
	int q=3;
	p*=p++ +2;
	p+= --p + ++q + q++;
	int s=10;
	s+= s-- + --s + ++q;
	q+= q+ ++q + ++p + --p;
	System.out.println(q++);//66
      System.out.println(p--);//23
	System.out.println(p++);//22
	System.out.println(s++);//34
	System.out.println(q);//67
	System.out.println(s);//35
	System.out.println(p);//23
//six end
//seven start
	int t=10;
	int w=20;
	boolean boo = (t++ >=w) || (t++ !=w);
	System.out.println(boo);//true
	System.out.println(t);//12
	System.out.println(w);//20
//seven end 
// eight start
	int y=10;
	int z=20;
      boo =(y++ ==z) && (y++ <=z);
	System.out.println(boo);//false
	System.out.println(y);//11
	System.out.println(z);//20
// eight end
	}
}
