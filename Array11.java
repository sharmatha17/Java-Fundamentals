import java.util.*;
public class Array11
{
	public static void main(String[] args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n];
		int i;
		boolean flag=false;
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(a[i]!=1&&a[i]!=4)
			{
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.print("false");
		}
		else
		{
			System.out.print("true");
		}
	}
}