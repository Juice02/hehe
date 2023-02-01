package quicksort;

import java.util.Scanner;

public class leakybucket {
    public static void main(String[] args) throws InterruptedException 
    {
    	Scanner Sc=new Scanner(System.in);
        int n,store=0,bucketsize,outgoing;
        System.out.println("Enter bucket size");
        bucketsize=Sc.nextInt();
        System.out.println("Enter Outgoing rate");
        outgoing=Sc.nextInt();
        System.out.println("Enter no of inputs");
        n=Sc.nextInt();
        int incoming[]=new int[n];
        System.out.println("Enter input packets");
        for(int i=0;i<n;i++)
        	incoming[i]=Sc.nextInt();
        for(int i=0;i<n;i++)
        {
        	System.out.println("Incoming packet size is "+ incoming[i]);
        	if(incoming[i]<=(bucketsize-store))
        	{
        		store+=incoming[i];
        		System.out.println("Bucket buffer size is " + store +"out of " +
        				bucketsize);
        	}
        	else
        	{
        		System.out.println("Packet loss is "+(incoming[i]-(bucketsize-store)));
        		store=bucketsize;
        		System.out.println("Bucket buffer size is " + store +"out of " +
        				bucketsize);
        	}
        	store-=outgoing;
        	System.out.println("After outgoing " + store +"left out of " +
    				bucketsize);
        	
        	
        
        
            Thread.sleep(1000);
        }
        }
        
    }
