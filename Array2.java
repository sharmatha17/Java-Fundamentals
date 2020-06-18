import java.util.Scanner;
public class Array2 
{
	public static void main(String[] args)
	{
		int n,max=0,min=9999;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Minimum:"+min);
		System.out.println("Maximum:"+max);

	}
}