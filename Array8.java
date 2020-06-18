import java.util.*;
public class Array8 
{
	public static void main(String[] args)
	{
		int n,sum=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n];
		int i,j;
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(a[i]==6)
			{
				for(j=i+1;j<n;j++)
				{
					if(a[j]==7)
					{
						i=j;
						continue;
					}
				}
			}
			else
			{
				sum+=a[i];
			}
		}
		System.out.println(sum);
	}
}