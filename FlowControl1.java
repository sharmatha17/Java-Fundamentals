import java.util.*;
public class FlowControl1 
{
	public static void main(String[] args)
	{
		int a;
		int b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		if((a%10)==(b%10))
			System.out.println("true");
		else
			System.out.println("false");
	}
}