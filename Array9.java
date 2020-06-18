import java.util.*;
public class Array9 
{
	public static void main(String[] args)
	{
		int n,count=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n];
		int i;
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(a[i]!=10)
			{
				if(a[i]!=0)
				{
					a[count++]=a[i];
				}
			}
		}
		while(count<n)
		{
			a[count++]=0;
		}
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}