import java.util.*;
public class Array4
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
		String s=null;
		for(int i:a)
		{
			s=Character.toString((char)i);
			System.out.print(s+" ");
		}
	}
}