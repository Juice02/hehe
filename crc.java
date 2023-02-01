package quicksort;
import java.util.*;

public class crc 
{
	
	public static void main(String[] args)
	{
	int i;
	Scanner Sc= new Scanner(System.in);
	
	System.out.println("Enter no of divisor bits");
	int m=Sc.nextInt();
	int[] div=new int[m];
	System.out.println("Enter the divisor bits");
	for(i=0;i<m;i++)
	{
		div[i]=Sc.nextInt();
	}
	
	System.out.println("Enter no or word bits");
	int n=Sc.nextInt();
	int[] word=new int[n+(m-1)];
	System.out.println("Enter the word bits");
	for(i=0;i<n;i++)
	{
		word[i]=Sc.nextInt();
	}
	
	int[]newword=new int[n+(m-1)];
	for(i=0;i<n;i++)
	{
		newword[i]=word[i];		//putting zeros in the new word where operation will happen
		
	}
	for(i=n;i<n+(m-2);i++)
	{
		newword[i]=0;
		
	}
	calc(div,newword);
	
}
	public static void calc(int div[],int newword[])
	{
		
		
		int i,k,j,m=div.length,n=newword.length;
		
		System.out.println(m);
		System.out.println(n);
		int[] x=new int[n];
		
		for(j=0;j<n;j++)					//initializing x to newword first time
		{
			x[j]=newword[j];
		
		}
		
		
		for(i=0;i<8;i++)
		{
			

			for(k=0;k<n;k++)
			{
				System.out.print(x[k]);
			}
			System.out.println(n);
			for(j=0;j<5;j++)					//comparing(XOR)
			{
				
				
				if(div[j]==x[i+j])
					x[i+j]=0;
				else
					x[i+j]=1;
			}
			for(k=0;k<n;k++)
			{
				System.out.print(x[k]);
			}
			
		}	
		
		
				
			
			
			
			
		
	
	
	
	
	
	}
}
	
	
	
	
