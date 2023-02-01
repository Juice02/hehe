package quicksort;
import java.util.*;
import java.math.BigInteger;

public class RSA 
{
	public static void main(String[] args)
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter two prime numbers ");
		int p=Sc.nextInt();
		int q=Sc.nextInt();				
		System.out.println("Enter Message to be sent ");
		String x=Sc.next();
		int lenx=x.length();
		int n=p*q;			//n
		int t1=p-1;
		int t2=q-1;
		int d,phi=(p-1)*(q-1);
		int e=d=1;
		while((t1*t2)%e==0)
		{
			e++;
		}
		System.out.println("Public Key e="+e);
		System.out.println("----------------");
		int ct[]=new int[lenx];
		int pt[]=new int[lenx];
		int temp[]=new int[lenx];
		for(int i=0;i<lenx;i++)
		{
			pt[i]=x.charAt(i)-96;
			ct[i]=(int)Math.pow((int)pt[i],e)%n;
			System.out.println("Cypher Text="+ct[i]);
		}
		System.out.println("Message Sent=");
		for(int i=0;i<lenx;i++)
		{
			temp[i]=ct[i]+96;
			System.out.print((char)temp[i]);
		}
		while((e*d)%phi!=1)									// calc_d
			d++;
		int ns[]=new int[lenx];
		System.out.println("Private Key(d)= "+d);
		System.out.println("----------------------------");
		for(int i=0;i<lenx;i++)
		{
			BigInteger very_big_no = BigInteger.valueOf(ct[i]);
			very_big_no = very_big_no.pow(d);
			very_big_no = very_big_no.mod(BigInteger.valueOf(n));
			temp[i] = very_big_no.intValue();

			System.out.println("Plain Text= "+temp[i]);		
		}
		for(int i=0;i<lenx;i++)
		{	
			temp[i]=temp[i]+96;
			System.out.print((char)temp[i]);		
		}
	}
}
