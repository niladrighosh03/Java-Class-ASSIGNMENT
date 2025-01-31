import java.util.*;
class Arr
{
    int a[], n;
    Scanner sc=new Scanner(System.in);
    void input()
    {
        System.out.println("Enter the size of array: ");
        n=sc.nextInt();
        a=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter array index "+(i+1));
            a[i]=sc.nextInt();
        }
    }
    
    void findmax()
    {
        int max=a[0];
        for(int i=0;i<n;i++)
        {
            if(a[i]>max)
                max=a[i];
        }
        System.out.println("The maximum number is "+max);
    }
    void findmin()
    {
       int min=a[0];
        for(int i=0;i<n;i++)
        {
            if(a[i]<min)
                min=a[i];
        }
        System.out.println("The minimum number is "+min);
    }
    void countprime()
    {
        int count=0, flag=0;
        for(int i=0;i<n;i++)
        { 
           for(int j=1; j<=a[i]/2;i++)
           {
            if(a[i]%j==0)
            {    flag++;
                  if(flag==0)
                    count++;
                
            }
           }
           flag=0;
        }
        System.out.println("Total number of prime number is "+count);
    }
    void bsort()
    {
        int temp;
        for(int pass=1;pass<n;pass++)
        {
            for(int index=0;index<=n-pass-1;index++)
            {
                if(a[index]>a[index+1])
                {
                    temp=a[index];
                    a[index]=a[index+1];
                    a[index+1]=temp;
                }
            }
        }
    }
    void bsearch(int item)
    {
        int lb=0, ub=n-1,count=0;
        int store=0,mid;
        while(lb<=ub)
        {
            mid=lb+(ub-lb)/2;
            if(a[mid]==item)
            {     count++; store=mid;}
            if(a[mid]<item)
                lb=mid+1;
            else
                ub=mid-1;
        }
        if(count!=0)
        System.out.println("The search item at index "+(store+1));
        else
        System.out.println("Not found the number");
    }
    void display()
    {
        System.out.println("Displaying the array:");
        for(int i=0;i<n;i++)
            System.out.println(a[i]+"\t");
    }
}

class Ass4
{
    public static void main(String ars[])
    {
        Scanner sc=new Scanner(System.in);
        int data;
        Arr ob=new Arr();
        ob.input();
        ob.display();
        ob.findmax();
        ob.findmin();
        System.out.println("\nAfter Bubble Sort:-");
        ob.bsort();
        ob.display();
        //ob.countprime();
        System.out.println("Enter the number to search ");
        data=sc.nextInt();
        ob.bsearch(data);
        //ob.display();
    }
}