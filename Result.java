import java.util.*;
class RationalClass
{
	int numerator,denominator,nr,dr;
	RationalClass()
	{
		numerator=0;
		denominator=0;
	}
	RationalClass(int num1,int dem1)
	{
		numerator=num1;
		denominator=dem1;
	}
	int gcd(int a,int b)
	{
		if(a==b) {
			return a;
}
		else if (a>b) {
			return gcd(a-b,b);
}
		else {
			return gcd(a,b-a);
		}
	}
	void simply()
	{
		int a=0,b=0;
		if(numerator<0) {
			a=-numerator;
}
		else {
			a=numerator;
}
		if(denominator<0) {
			b=-denominator;
		}
		else {
			b=denominator;
}
		int g=gcd(a,b);
		nr=numerator/g;
		dr=denominator/g;
	}
	void display()
	{
		System.out.println("Original:"+numerator+"/"+denominator);
		System.out.println("Simplified:"+nr+"/"+dr);
	}
	void add(RationalClass f1,RationalClass f2)
	{
		//f1=a/b    f2=c/d   f1+f2=(ad+bc)/bd
		numerator=(f1.numerator*f2.denominator+f1.denominator*f2.numerator);
		denominator=f1.denominator*f2.denominator;
	}
	void sub(RationalClass f1,RationalClass f2)
	{
	//f1=a/b f2=c/d f1-f2=(ad-bc)/bd
		numerator=f1.numerator*f2.denominator-f1.denominator*f2.numerator;
		denominator=f1.denominator*f2.denominator;
	}
	void mul(RationalClass f1,RationalClass f2)
	{
		//f1=a/b   f2=c/d    f1*f2=ac/bd
		numerator=f1.numerator*f2.numerator;
		denominator=f1.denominator*f2.denominator;
	}
	void div(RationalClass f1,RationalClass f2)
	{
		//f1=a/b    f2=c/d   f1/f2=ad/bc
		numerator=f1.numerator*f2.denominator;
		denominator=f1.denominator*f2.numerator;
	}
}
class Result
{
	public static void main(String ars[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num and dem of first frac:");
		int n1=sc.nextInt();
		int d1=sc.nextInt();
		System.out.println("Enter num of dem of second fraction:");
		int n2=sc.nextInt();
		int d2=sc.nextInt();
		System.out.println("First Fraction:"+n1+"/"+d1);
		System.out.println("Second Fraction:"+n2+"/"+d2);
		RationalClass f1=new RationalClass(n1,d1);
		RationalClass f2=new RationalClass(n2,d2);
		RationalClass f3=new RationalClass();
		System.out.println("Addition Result is :");
		f3.add(f1,f2);
		f3.simply();
		f3.display();
		System.out.println("Subtraction Result is :");
		f3.sub(f1,f2);
		f3.simply();
		f3.display();
		System.out.println("Multiplication Result is :");
		f3.mul(f1,f2);
		f3.simply();
		f3.display();
		System.out.println("Division result is :");
		f3.div(f1,f2);
		f3.simply();
		f3.display(); 	
	}
}
