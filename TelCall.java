class TelCall
{
	int n;
	float amt=0;
	String name,Phno;
	TelCall(String Name,String ph_No, int callno)
	{
		n=callno;
		Phno=ph_No;
		name=Name;
	}
	void compute()
	{
		if(n>=0 && n<=100) 
			amt=(float) 500;
		else if (n>=101 && n<=200 ) 
			amt= (float) (500+(n-100));
		else if(n>=201 && n<=300) 
			amt= (float) (500+(100*1)+(n-200)*1.20);
		else
			amt= (float) (500+100+(100*2)+(n-300)*1.50);
	}
	void dispdata()
	{
		System.out.println("Phone no \t Name \t Total calls\t\t Amount");
		System.out.println(Phno+"\t "+name+"\t    "+n+"\t\t\t  "+amt);
	}
	public static void main(String args[])
	{
		TelCall obj=new TelCall("Niladri","9876543210",341);
		obj.compute();
		obj. dispdata();
	}
}
