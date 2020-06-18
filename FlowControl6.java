import java.util.*;
public class FlowControl6 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String gender=sc.nextLine();
		int age=sc.nextInt();
		if(gender=="female"&&age>=1||age<=58)
		{
			System.out.println("5.2%");
		}
		else if(gender=="female"&&age>=59||age<=100)
		{
			System.out.println("9.2%");
		}
		else if(gender=="male"&&age>=1||age<=58)
		{
			System.out.println("8.4%");
		}
		else if(gender=="male"&&age>=59||age<=100)
		{
			System.out.println("10.5%");
		}
	}
}