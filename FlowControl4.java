import java.util.*;
public class FlowControl4
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		char a=sc.next().charAt(0);
		char b=sc.next().charAt(0);
		if(a>b)
			System.out.println(b+","+a);
		else
			System.out.println(a+","+b);
	}
}