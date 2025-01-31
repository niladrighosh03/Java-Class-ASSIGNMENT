import java.util.*;
class Ebill
{
	int unit1,i,n;
	String name;
	double amt;
	String arr1[]=new String[100];
	int arr2[]=new int[100];
	double arr3[]=new double[100];
	Scanner sc=new Scanner(System.in);
	void member()
	{
		System.out.println("Enter the Total number of members: ");
		n=sc.nextInt();
	}
	void input()
	{
		for(i=0;i<n;i++)
		{
			System.out.println("Enter the Name:");
			name=sc.next();
			arr1[i]=name;
			System.out.println("Enter the unit: ");
			unit1=sc.nextInt();
			arr2[i]=unit1;
			calculate(unit1);
			arr3[i]=amt;
		}
	}
	void calculate(int unit)
	{   
		if(unit<=50)
			amt=100;
		else if(unit<=100)
			amt=100+(unit-50)*1.5;
		else if(unit<=150)
			amt=100+75+(unit-100)*2;
		else if(unit<=200)
			amt=100+75+100+(unit-150)*2.5;
		else if(unit>200)
			amt=100+75+100+150+(unit-200)*3;
		      
	}
	void display()
	{
		for(i=0;i<n;i++)
		{
			System.out.println(arr1[i]+"\t\t"+arr2[i]+"\t\t"+"Rs."+arr3[i]);
		} 
	}
}

class EbillAmt
{
	public static void main(String ars[])
	{
		int n, i;
		Scanner sc=new Scanner(System.in);
		Ebill ob=new Ebill();
		ob.member();
		ob.input();
		System.out.println("________________________________________");
		System.out.println("Name\t\tUnit\t\tAmount");
		System.out.println("________________________________________");
		ob.display(); 
		System.out.println("________________________________________");
	}
}
