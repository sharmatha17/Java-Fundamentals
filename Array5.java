import java.util.*;
public class Array5
{
	public static void main(String[] args)
	{
		int n,temp=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.print("last two digit:"+a[n-2]+" "+a[n-1]);
		System.out.print("\nfirst two digit:"+a[0]+" "+a[1]);
	}
}