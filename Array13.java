import java.util.*;
public class Array13  
{
	public static void main(String[] args)
	{
		int n,m;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		int a[][]=new int[n][m];
		int i;
		int j = 0;
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("The given array is:");
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.print("\n");
		}
		System.out.println("The reverse of the array is:");
		for(i=n-1;i>=0;i--)
		{
			for(j=m-1;j>=0;j--)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
}