import java.util.*;
public class Array7 
{
	public static void main(String[] args)
	{
		int n,temp=0;
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
			for(j=0;j<i;j++)
			{
				if(a[i]==a[j])
				{
					break;
				}
			}
			if(i==j)
			{
				System.out.print(a[i]+" ");
			}
		}
	}
}