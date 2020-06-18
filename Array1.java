import java.util.*;
public class Array1
{
	public static void main(String[] args)
	{
		int n,sum=0,avg=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			sum=sum+a[i];
			avg=sum/n;
		}
		System.out.println("Sum is:"+sum);
		System.out.println("Average is:"+avg);
	}
}