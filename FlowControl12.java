import java.util.*;
public class FlowControl12 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int flag=0;
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
				flag=1;
			else
				flag=0;
		}
		if(flag==1)
			System.out.println("Not Prime");
		else
			System.out.println("Prime");
	}
}