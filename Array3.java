import java.util.*;
public class Array3 
{
	public static void main(String[] args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int m;
		boolean found=false;
		System.out.println("Enter elemnt to find:");
		m=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(a[i]==m)
			{
				found=true;
				m=i;
				break;
			}
		}
		if(found)
			System.out.println(m);
		else
			System.out.println("-1");
	}
}