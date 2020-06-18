import java.util.*;
public class FlowControl17 
{
	public static void main(String[] args)
	{
		int n,rev=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a=n;
		while(n!=0)
		{
			rev=rev*10;
			rev=rev+n%10;
			n=n/10;
		}
		if(a==rev)
			System.out.println(a+" is a palindrome");
		else
			System.out.println(a+" is not a palindrome");
	}
}