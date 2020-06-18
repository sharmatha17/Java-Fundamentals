import java.util.*;
public class Array12 
{
	public static void main(String args[])
	{
		int n,i;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
		}
		int c[]={a[1],b[2]};
		System.out.print(Arrays.toString(c));
	}
}
