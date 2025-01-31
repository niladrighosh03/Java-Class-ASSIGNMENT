import java.util.*;
class Chain
{
	int ele[],cap,front,end;
	Chain(int max)
	{
		cap=max;
		front=-1;
		end=-1;
		ele=new int[cap];
	}
	void pushfront(int v)
	{
		if((front==0 && end==cap-1)|| front==end+1)
		{
			System.out.println("Chain is now full from first.");
			return;
		}
		if(front==-1)
			front=end=0;
		else if(front==0)
			front=cap-1;
		else 
			front-=1;
			ele[front]=v;
	}
	void popfront()
	{
		if(front==-1)
		{
			System.out.println("-999\n");
			return;
		}
		System.out.println("The Deleted element: "+ele[front]);
		if(front==end)
			front=end=-1;
		else
		{
			if(front==cap-1)
				front=0;
			else 
				front+=1;
		}
		return ;
	}
	void pushrear(int v)
	{
		if((front==0 && end==cap-1)|| front==end+1)
		{
			System.out.println("Chain is full from end.");
			return;
		}
		if(front==-1)
			front=end=0;
		else if(end==cap-1)
			end=0;
		else
			end+=1;
			ele[end]=v;
	}
	void poprear()
	{
		if(front==-1)
		{
			System.out.println("-999\n");
			return ;
		}
		System.out.println("Deleted element: "+ele[end]);
		if(front==end)
			front=end=-1;
		else if(end==0)
			end=cap-1;
		else 
			end-=1;
		return ;
	}
}
class Ass6
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number ");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		Chain ob = new Chain(n);
		int ch,k;
		while(true)
		{
			System.out.println("1.Push in front.");
			System.out.println("2.Push in end.");
			System.out.println("3.Pop front.");
			System.out.println("4.Pop end.");
			System.out.println("5.exit.");
			System.out.println("Enter your choice? ");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					System.out.println("Enter value: ");
					k=sc.nextInt();
					ob.pushfront(k);
					break;
				case 2:
					System.out.println("Enter value: ");
					k=sc.nextInt();
					ob.pushrear(k);
					break;
				case 3:
					ob.popfront();
					break;
				case 4:
					ob.poprear();
					break;
				case 5:
					System.exit(0);
				default:
					System.out.println("Wrong input");
					break;
			}
		}
	}
}
