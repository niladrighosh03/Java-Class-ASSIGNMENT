import java.util.*;
class Str
{
	String s;
	Scanner sc=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter a Sentence: ");
		s=sc.nextLine();
	}
	void countVowel()
	{
		int i,count=0;
		for(i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				count++;
			}
		}
		System.out.println("Total no. of vowels are: "+count);
	}
	void checkPalin()
	{
		int i;
		String reverseStr = "";    
		for (i = (s.length()-1);i>=0;--i) 
		{
			reverseStr = reverseStr+s.charAt(i);
		}
		if (s.toLowerCase().equals(reverseStr.toLowerCase())) 
		{
			System.out.println(s + ": is a Palindrome String.");
		}
		else 
		{
			System.out.println(s + ": is not a Palindrome String.");
		}
	}
	void countFrequency()
	{  
        int i,j;
		int[] freq = new int[s.length()];  
        char s1[] = s.toCharArray();            
        for(i=0;i<s.length();i++) 
        {  
            freq[i]=1;  
            for(j=i+1;j<s.length();j++) 
            {  
                if(s1[i]==s1[j])
                {  
                    freq[i]++;    
                    s1[j]='0';  
                }  
            }  
        } 
        System.out.println("Characters frequencies");  
        for(i=0;i<freq.length;i++) 
        {  
            if(s1[i]!=' ' && s1[i]!= '0')
			{
                System.out.println("   "+s1[i]+"\t\t"+freq[i]);
			}
		}
	}
	void replace()
	{
		int i;
		char ch[]=s.toCharArray();
		for(i=0;i<s.length();i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
			{
				ch[i]='#';
			}
		}
		for(i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]);
		}
	}
}

class StrAns
{
	public static void main(String args[])
	{
		Str ob=new Str();
		ob.input();
		ob.countVowel();
		ob.checkPalin();
		ob.countFrequency();
		ob.replace();
	}
}
