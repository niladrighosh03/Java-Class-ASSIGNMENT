import java.util.*;
class ebill
{
    public int n;
    Scanner sc=new Scanner(System.in);
    float unit,amt;
    String name;
    String nam[];
    float uni[];
    float am[];
    void input()
    {
        int step=1;
        System.out.print("Enter the number of customer(s): ");
        n=sc.nextInt();
        nam=new String[n];
        uni=new float[n];
        am=new float[n];
        for(int i=0;i<n;i++)
        {
           System.out.println("Details of person no. "+step+++":");
           System.out.print("Enter the name: ");
           nam[i]= sc.next(); 
           System.out.print("Enter the unit of electricity consumption: ");
           uni[i]=sc.nextFloat();
        }
    }
    void calculate()
    {
        
         for(int i=0;i<n;i++)
        {
            if(uni[i]<=50)
            {
                am[i]=100;
            }
            else if(uni[i]<=100)
            {
                am[i]=(float) ((100)+(uni[i]-50)*1.5);
            }
            else if (uni[i]<=150)
            {
                am[i]=(float) ((100)+(50*1.5)+(uni[i]-100)*2);
            }
            else if(uni[i]<=200)
            {
                am[i]=(float) ((100)+(50*1.5)+(50*2)+(uni[i]-150)*2.5);
            }
            else
            {
                am[i]=(float) ((100)+(50*1.5)+(50*2)+(50*2.5)+(uni[i]-200)*3);
            }
        }
    }
    void display()
    {
        System.out.println("Name\t unit\t  Amount");
        for(int i=0;i<n;i++)
        {
            System.out.println(nam[i]+" \t"+uni[i]+"    \t"+am[i]);
        }
    }
}
class Ass3
{
    public static void main(String ars[])
    {
        ebill ob=new ebill();
        ob.input();
        ob.calculate();
        ob.display();
        
    }
}
