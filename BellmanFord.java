package quicksort;
import java.util.*;


public class BellmanFord 
{
	int d[];
	int n;
	public static final int MAX_Val=999;
	public BellmanFord(int n)
	{
		this.n=n;
		d=new int[n+1];
	}
	void eval(int x,int A[][])
	{
		for(int node=1;node<=n;node++)
		{
			d[node]=MAX_Val;
		}
		d[x]=0;
		
		for(int node=1;node<=n-1;node++)
		{
			for(int sn=1;sn<=n;sn++)
			{
				for(int dn=1;dn<=n;dn++)
				{
					if(A[sn][dn]!=MAX_Val)
					{
						if(d[sn]+A[sn][dn]<d[dn])
							d[dn]=d[sn]+A[sn][dn];
					}
				}
			}
		}
		for(int i=1;i<=n;i++)
		{
			System.out.println("Path from "+x+" to "+i+" is "+d[i]+".");
		}
		
		
	}
	
	
	
	public static void main(String[] args)
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter no of vertices");
		int n=Sc.nextInt();
		int A[][]=new int[n+1][n+1];
		System.out.println("Enter the adjecancy matrix");
		for(int s=1;s<=n;s++)
		{
			for(int d=1;d<=n;d++)
			{
				A[s][d]=Sc.nextInt();
				if(s==d)
				{
					A[s][d]=0;
					continue;
				}
				if(A[s][d]==0)
				{
					A[s][d]=MAX_Val;
				}
			}

		}
		
		for(int s=1;s<=n;s++)
		{
			for(int d=1;d<=n;d++)
			{
				System.out.print(A[s][d]);
			}
			System.out.println();
			
		}
		
		
		
		System.out.println("Enter source vertex");
		int x=Sc.nextInt();
		BellmanFord bellmanford=new BellmanFord(n);
		bellmanford.eval(x,A);

		
		
	}
}
