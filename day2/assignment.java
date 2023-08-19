/*assignment operator = += -= *= /= %= */
class assignment{
public static void main(String []args){
int a=20;
int b=30;
int c=40;
System.out.println(a+30);

a+=30; //a=a+30-->50
System.out.println(a);
b-=10; //b=b-10-->20
System.out.println(b);
a+=b+=a-=10;//a=a-10-->10 b=b+a-->40 a=a+b-->60
System.out.println(a);
System.out.println(b);
a+=c-=b+=c*=c/=2;
System.out.println(a);
System.out.println(b);
System.out.println(c);
c-=a+=b+=2;
System.out.println(a);
System.out.println(b);
System.out.println(c);
b+=a+=c+=1;
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
}

